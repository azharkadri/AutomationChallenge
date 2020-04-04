package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class UseArrayListToFind2MaxNum {
	
	public static void _2ndMaxNum(List<Integer> list) {
    int secondLargest = list.get(1);
    int largest = list.get(0);
    for (int i = 0; i < list.size(); i++)
    {
        if(list.get(i) > largest)
        {
            secondLargest = largest;
            largest = list.get(i);

            if(list.get(i) > secondLargest && list.get(i) != largest )
            {
                secondLargest = list.get(i);
            }
        }
    }
    System.out.print("Second biggest number "+secondLargest);
    }
	
    public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		_2ndMaxNum(al);	
	}
}
