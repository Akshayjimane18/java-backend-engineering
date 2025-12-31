package coreJava.practice;

public class FibonnaciSeriesWithPrime {

    public static void main(String[] args) {

        int fibonnaciUpto = 40;
        int n1 = 0, n3 = 0;
        int n2=1;

        while(true){

            n3 = n1+n2;
            if(n3>=fibonnaciUpto){
                break;
            }

            boolean primeNumber = true;
            for(int j = 2;j<n3;j++){

                if(n3%j==0){
                    primeNumber = false;
                }

            }

            if(primeNumber) {
                System.out.println(n3);
            }



            n1=n2;
            n2=n3;



        }
    }
}
