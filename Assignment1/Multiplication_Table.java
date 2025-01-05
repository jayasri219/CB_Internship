package Assignment1;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter table");
    int num=s.nextInt();
    for(int i=1;i<=10;i++) {
    	System.out.println(num+"*"+i+"="+(num*i));
    }
    s.close();
	}

}

