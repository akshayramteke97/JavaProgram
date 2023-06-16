package in.Assignment;

import java.util.Scanner;

public class Question1 {
	public static int getSquareRoot(int num) {
		int s;
		int squareRoot=num/2;
		do {
			s=squareRoot;
			squareRoot=(s+(num/s))/2;
		}while((s-squareRoot)!=0);
		return squareRoot;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any integer number : ");
		int num=scan.nextInt();
		int result=getSquareRoot(num);
		System.out.println("square Root of "+num+" is : "+result);
		
	}
}
