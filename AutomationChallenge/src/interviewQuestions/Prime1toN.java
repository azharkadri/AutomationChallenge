package interviewQuestions;

public class Prime1toN {
	public static void isPrime(int n) {
		int half=n/2;
		int counter=0;
		for(int i=2; i<=half; i++) {
			if(n%i==0) {
				counter++;
				break;
			}
		}
		if(counter==0)
			System.out.println("prime number :"+n);
	}

	public static void main(String[] args) {
		for(int i=2; i<=10; i++) {
			isPrime(i);
		}

	}

}
