package coreJava.practice;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr1[][]=new int[2][2];
		int arr2[][]=new int[2][2];
		int i,j,k;
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
		for(i=0;i<arr2.length;i++){
			for(j=0;j<arr2.length;j++){
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println(" ");
		}
		int c[][]=new int[2][2];
		System.out.println("the multiplication  of arr is =");
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				for(k=0;k<2;k++){
					c[i][j]=c[i][j]+(arr1[i][k]*arr2[k][j]);
					
				}
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println(" ");
		}


	}

}
