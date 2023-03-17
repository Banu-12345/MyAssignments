package Week3day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "dhilshathbanu";
		char[] test1=test.toCharArray();
		int len=test1.length;
		String s1 = "";
		for(int i=0;i<=len-1;i++)
		{
			if(i%2!=0)
			{
				test1[i]=Character.toUpperCase(test1[i]);
				 s1=String.valueOf(test1);
			
		//	System.out.println(test1[i]);
			
		}
			
		}
		System.out.println("The given string is: " +test);
		System.out.println("Changes string is: " +s1);	
	}

}
