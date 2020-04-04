package interviewQuestions;

public class PalindromeString {
	public static void isPalindrome(String str) {
		int len=str.length();
		char[] ch=new char[len];
		for(int i=0, j=len-1 ; i<len ; i++, j--) {
			ch[i]=str.charAt(j);
		}
		String revStr=new String(ch);
		if(revStr.equals(str))
			System.out.println("string is palindrome :"+str);
		else
			System.out.println("String is not palindrome :"+str);
			
	}

	public static void main(String[] args) {
		String str="madam", str2="papa";
		isPalindrome(str);
		isPalindrome(str2);

	}

}
