package Week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PrintDuplicateElemntinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {12,13,14,5,6,7,6,7,8};
		List<Integer> data=new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(data);
		for(int i=1;i<=data.size();i++)
		{
			for(int j=i+1;j<=data.size();j++)
			{
				if(data.get(i-1)==data.get(j-1))
		System.out.println(data.get(i));
		}
		

	}

}
}