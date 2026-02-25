package coreJava.multithreadingAndConcurrency.ConsumerProducer;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.*;


class MessageRepository {
    private String message;
    private boolean hasMessage = false;

    private final Lock lock = new ReentrantLock();

    public String read() throws InterruptedException {

        if (lock.tryLock()) {
            try {
                while (!hasMessage) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                hasMessage = false;
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("** read blocked " + lock);
            hasMessage = false;
        }

        return message;
    }

    public void write(String message) throws InterruptedException {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                try {
                    while (hasMessage) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    hasMessage = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("** write blocked " + lock);
                hasMessage = true;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.message = message;
    }
}

class MessageWriter implements Runnable {
    private MessageRepository outgoingMessage;

    public MessageWriter(MessageRepository outgoingMessage) {
        this.outgoingMessage = outgoingMessage;
    }

    private final String messages = """
            Hello, World!,
            Multithreading in Java,
            Producer-Consumer Problem,
            Synchronization is key,
            Goodbye!""";

    @Override
    public void run() {
        Random random = new Random();
        String[] lines = messages.split("\n");

        for (String msg : lines) {
            try {
                outgoingMessage.write(msg);
                System.out.println("Written: " + msg);
                Thread.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        try {
            outgoingMessage.write("END");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MessageReader implements Runnable {

    private MessageRepository incomingMessage;

    public MessageReader(MessageRepository incomingMessage) {
        this.incomingMessage = incomingMessage;
    }

    @Override
    public void run() {
        Random random = new Random();
        String latestMsg = "";

        do {
            try {
                Thread.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            try {
                latestMsg = incomingMessage.read();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Read: " + latestMsg);
        } while (!latestMsg.equals("END"));
    }
}

public class Main {
    public static void main(String[] args) {
        MessageRepository messageRepository = new MessageRepository();

        Thread reader = new Thread(new MessageReader(messageRepository), "Reader-Thread");
        Thread writer = new Thread(new MessageWriter(messageRepository), "Writer-Thread");

        writer.setUncaughtExceptionHandler((thread, excep) -> {
            System.out.println("Writer had exception " + excep);
            if (reader.isAlive()) {
                System.out.println("Going to interrupt reader");
                reader.interrupt();
            }
        });

        reader.setUncaughtExceptionHandler((thread, excep) -> {
            System.out.println("Reader had exception " + excep);
            if (writer.isAlive()) {
                System.out.println("Going to interrupt writer");
                writer.interrupt();
            }
        });
        reader.start();
        writer.start();
    }
}
