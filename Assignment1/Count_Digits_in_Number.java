package Assignment1;

import java.util.Scanner;

public class Count_Digits_in_Number {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int number=sc.nextInt();
    //converting number into string to count the no.of digits in given number
    String str=String.valueOf(number);
    System.out.println("no.of didgits: "+str.length());
     sc.close();
	}
}
