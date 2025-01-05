package Assignment1;

public class LargestNumberInArray {

	public static void main(String[] args) {
	 int arr[]= {23,56,3,9,67,11,20,99};
	 int Largestnum=0;
	 for(int i=0;i<arr.length;i++) {
		 if(Largestnum<arr[i]) {
			 Largestnum=arr[i];
		 }
	 }
     System.out.println(Largestnum);
	}

}


