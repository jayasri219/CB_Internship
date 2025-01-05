package Assignment1;

import java.util.Scanner;

public class Count_Words_InString {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter");
	String str=sc.next();
	int count =1;
	for(int i=0;i<str.length()-1;i++) {
		if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
		count ++;	
		}
	}
	System.out.println(count);
	sc.close();
	}

}


