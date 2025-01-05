package Assignment1;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int answer = 0;
		while(num>0) {
			int lastDigit = num%10;
			answer=answer*10+lastDigit;
			num=num/10;
		}
		System.out.println(answer);
		sc.close();

	}

}
