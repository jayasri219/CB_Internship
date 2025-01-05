package Assignment1;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		int result=num1+num2;
		System.out.println("total sum of two numbers is ="+result);
		sc.close();

	}

}

