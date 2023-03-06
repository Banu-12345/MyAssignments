package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int  arr[]= {93,26,60,50,80,70,20,10,83,92};
		int len = 0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		len=arr.length;	
	    }
		System.out.println("Second largest is:"+arr[len-2]+"\n"+"Second smallest num is:"+arr[1]);
		
}
}