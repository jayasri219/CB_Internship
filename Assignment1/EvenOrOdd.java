package Assignment1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Given number is even numbers");
		}else {
			System.out.println(("Given number is odd number"));
		}
       sc.close();
	}

}
