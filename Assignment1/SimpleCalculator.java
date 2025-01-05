package Assignment1;


import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number1");
		int num1=sc.nextInt();
		System.out.println("enter number2");
		int num2=sc.nextInt();
		System.out.println(" 1-Add \n 2-subtract \n 3-multiply \n 4-division ");
		System.out.println("choose operator");
		int operator=sc.nextInt();
		
		int result=0;
		switch(operator) {
		case 1:
			result=num1+num2;
			break;
		case 2:
			result=num1-num2;
			break;
		case 3:
			result=num1*num2;
			break;
		case 4:
			result=num1/num2;
		default:
			System.out.println("invalid operator");
		}
      System.out.println("result = "+result);
	}

}
