package Assignment1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	
		boolean leap=false;
		System.out.println("enter year to be checked: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if( year % 4 ==0) {
			if(year % 100 == 0) {
				if (year % 400 == 0) 
					leap = true;
				else
				leap = false;
			} 
			leap=true;
		}else
			leap=false;
       System.out.println(year+" is a leap year: "+leap);
	}

}
