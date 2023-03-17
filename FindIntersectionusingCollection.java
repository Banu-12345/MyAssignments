package Week3day2;

import java.util.ArrayList;

public class FindIntersectionusingCollection {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(5);
		list1.add(3);
		
	System.out.println("List 1: "+list1);	
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(0);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(8);
		list2.add(9);
		System.out.println("List 2: "+list2);
		for(int i=0;i<list1.size();i++)
		{
			
			for(int j=0;j<list2.size();j++)
			{
				if (list1.get(i).equals(list2.get(j)))
					
					System.out.println(list1.get(i));	
						
		}
	
	    }

	}
}
