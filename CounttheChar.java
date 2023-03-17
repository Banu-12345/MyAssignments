package Week3day2;

public class CounttheChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Banu";
		int count=0;
		char[] chararray=name.toCharArray();
		for(int i=1;i<=chararray.length-1;i++)
		{
			if(chararray[i]=='a')
				count++;
		}
System.out.println(count);
	}

}
