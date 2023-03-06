package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int arr1[]={1,25,3,4,6};
		int arr2[]={7,2,9,1,10};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
		      if(arr1[i]==arr2[j])
		      {
		    	  System.out.println("Intersections is:"+arr1[i]); 
		      }
			}
		}
	}

}
