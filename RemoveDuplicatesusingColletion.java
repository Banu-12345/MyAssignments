package Week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesusingColletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";	
		String[] text1=text.split(" ");
		List<String> list=new ArrayList<String>(Arrays.asList(text1));
	//	System.out.println(list);
		Set<String> list1=new LinkedHashSet<String>(list);
		for(String list2:list1)
		{
			System.out.println(list2.join(" ",list1));
			break;
		}
		
		
		//System.out.println(list1);
	

	}

}
