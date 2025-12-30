package coreJava.practice;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row,col;
		System.out.println("enter th enumber of row");
		row=sc.nextInt();
		System.out.println("enter the number of column");
		col=sc.nextInt();
		int arr1[][]=new int[row][col];
		int c[][]=new int[col][row];
		
		int i,j;
		System.out.println("Enter the element arr1");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				arr1[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("the matrix are arr1");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println(" ");
		}
			
			for(i=0;i<row;i++){
				for(j=0;j<col;j++)
				{
					
					c[j][i]=arr1[i][j];
				}
			}
			System.out.println("transport matrix is:");
			
			for(i=0;i<col;i++)
			{
				
				for(j=0;j<row;j++)
				{
					
					System.out.print(c[i][j]+" ");
					
				}
				System.out.println(" ");
					
			}
			
			
		}

	}


