package Assignment1;

import java.util.Scanner;

public class Count_Vowels {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter string");
	String str=sc.next();
	str=str.toLowerCase();
	int count =0;
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
		}
	}
	System.out.println(count);
	sc.close();

	}

}

