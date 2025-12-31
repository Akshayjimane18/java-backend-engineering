package coreJava.practice;

public class RemoveDuplicateString {

    public static void main (String[] args)
    {
        String s = "chandana";


        char[] a= s.toCharArray();

        for (int i = 0;i<a.length ; i++){

            for (int j =i+1;j<a.length ;j++ ){

                if(a[i]==a[j]){
                    s=s.replace(s.charAt(j),Character.MIN_VALUE);
                }
            }
        }


        String s1= String.copyValueOf(a);

        System.out.println(s);
    }
}
