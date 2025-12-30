package coreJava.practice;

import java.util.Scanner;

public class AdditionOfMatrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr1[][]=new int[2][2];
		int arr2[][]=new int[2][2];
		int i,j;
		System.out.println("Enter the element arr1");
		for(i=0;i<arr1.length;i++){
			for(j=0;j<arr1.length;j++){
				arr1[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("the matrix are arr1");
		for(i=0;i<arr1.length;i++){
			for(j=0;j<arr1.length;j++){
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Enter the element arr2 ");
		for(i=0;i<arr2.length;i++){
			for(j=0;j<arr2.length;j++){
				arr2[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("the matrix are arr2");
		for(i=0;i<arr1.length;i++){
			for(j=0;j<arr1.length;j++){
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
		int sum[][]=new int[2][2];
		for(i=0;i<sum.length;i++){
			for(j=0;j<sum.length;j++){
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("the addition of 2 array ");
		for(i=0;i<sum.length;i++){
			
			for(j=0;j<sum.length;j++){
				
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

	}

}
