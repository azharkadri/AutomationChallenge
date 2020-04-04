package interviewQuestions;

public class PatternNumber {
	/*
	 1234 
	 2341
	 3412
	 4123
	 */

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=i; j<=4; j++) {
				System.out.print(j);
				if(j==4) {
					for(int k=1; k<i; k++)
						System.out.print(k);
				}
			}
			System.out.println();
		}
	}
}
 