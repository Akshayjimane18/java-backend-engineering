package coreJava.practice;

import java.util.Scanner;

public class ArrayLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the five element's");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		int slargest=arr[1];
		int tlargest=arr[2];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest ){
				tlargest=slargest;
				slargest=largest;
				largest=arr[i];
				
			}
			if(arr[i]>slargest&& arr[i]!=largest){
				tlargest=slargest;
				slargest=arr[i];
			}
			if(arr[i]>tlargest&& arr[i]!=largest&& arr[i]!=slargest){
				tlargest=arr[i];
			}
		}
		System.out.println("the largest vlue is="+largest);
		System.out.println("the slargest value is= "+slargest);
		System.out.println("the tlargest value is ="+tlargest);
	}

}
