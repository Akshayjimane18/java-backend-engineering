package coreJava.EventHandling.src.Swings;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo1 extends JFrame{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1;
	JPanel p1,p2;
	LoginDemo1(){
		l1=new JLabel("Username");
		t1=new JTextField(10);
		
		l2=new JLabel("Password");
		t2=new JPasswordField(10);
		
		
		b1=new JButton("Login");
		p1=new JPanel();
		p2=new JPanel();
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		
		p1.setLayout(new GridLayout(2,2));
		p2.add(b1);
		p2.setLayout(new GridLayout(1,1));
		add(p1);
		add(p2);
		setLayout(new GridLayout(2,1));
		
		setLayout(new FlowLayout());
		setTitle("Login");
		setVisible(true);
		setSize(300,200);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame loginw=new JFrame();
		loginw.setTitle("Login");
		loginw.add(new LoginDemo1());
		loginw.setSize(300, 200);
		loginw.setVisible(true);
	}

}
