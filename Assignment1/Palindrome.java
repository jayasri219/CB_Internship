package Assignment1;

public class Palindrome {

	public static void main(String[] args) {
	String word="madam";
	int i=0;
	int j=word.length()-1;
	while(i<j) {
		if(word.charAt(i)!=word.charAt(j)) {
			System.out.println("not palindrome");
			System.exit(0);
		}
		i++;
		j--;
	}
     System.out.println("palindrome");
	}

}

