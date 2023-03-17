package Week3day2;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindSecondLargestusingCollection {

	public static void main(String[] args) {
		
		List<Integer> data=new ArrayList<Integer>();
		data.add(10);
		data.add(29);
		data.add(20);
		data.add(10);
		data.add(20);
		data.add(25);
		data.add(35);
		data.add(29);
		System.out.println(data);
		Collections.sort(data);
		System.out.println(data);
		
	
	
	System.out.println(data.get(data.size()-2));
		

	}

}
