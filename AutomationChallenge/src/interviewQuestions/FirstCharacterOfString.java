package interviewQuestions;

import org.testng.annotations.Test;

public class FirstCharacterOfString {
	
	@Test
	public void TestFirstCharacterOfString() {
		String str="azhar kadri";
		String[] strArray=str.split(" ");
		char[] c=new char[strArray.length];
		
		int i=0;
		for(String s : strArray) {
			System.out.println(s);
			c[i++] = s.charAt(0);
		}
		for(int j=0;j<c.length;j++) {
			System.out.println(c[j]);
		}
	}

}
