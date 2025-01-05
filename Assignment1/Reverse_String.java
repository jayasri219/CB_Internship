package Assignment1;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter word");
	String str=sc.next();
	String result="";
	for(int i=str.length()-1;i>=0;i--) {
		
		result=result+str.charAt(i);
	}
	System.out.println(result);
	sc.close();

	}

}
