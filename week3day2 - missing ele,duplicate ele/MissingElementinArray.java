package Week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MissingElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<Integer>();
		
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(4);
		list.add(7);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		for(int i=1;i<list.size();i++)
		{
		//	System.out.println(list.get(i)-1);
			if(list.get(i-1)!=i)
			System.out.println(i);	
				
		}
		
	}

}
