package exception;

public class UserDefinedException extends Exception{
	private static int[] acc_no= {001,002,003,004,005,006};
	private static String[] name= {"azhar","arshad","sanober","farhin","anzar","anabiya"};
	private static int[] balance= {1000,2000,3000,2000,400,1200};
	
	UserDefinedException(){}
	UserDefinedException(String str){
		super(str);
	}

	public static void main(String[] args) {
		System.out.println("acc_no \t name \t balance");
		try {
			for(int i=0;i<6;i++) {
				System.out.println(acc_no[i]+"\t"+name[i]+"\t"+balance[i]);
				if(balance[i]<1000) {
					UserDefinedException ude=new UserDefinedException("amount is less than 1000.");
					throw ude;
				}
			}		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
