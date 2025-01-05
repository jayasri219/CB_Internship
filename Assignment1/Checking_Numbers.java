package Assignment1;

import java.util.Scanner;

public class Checking_Numbers {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number");
	int number =sc.nextInt();
	if(number>0) {
		System.out.println("positive number");
	}else if(number<0) {
		System.out.println("negative number");
	}else {
		System.out.println("zero");
	}
     sc.close();
	}

}

