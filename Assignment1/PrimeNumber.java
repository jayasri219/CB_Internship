package Assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
	int n=13;
	Boolean prime=true;
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			prime=false;
			break;
		}
	}
      System.out.println(prime);
	}

}


