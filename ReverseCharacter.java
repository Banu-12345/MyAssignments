package Week3day2;

public class ReverseCharacter {

	public static void main(String[] args) {
		String name = "Banu";
		char[] chararray=name.toCharArray();
		for(int i=chararray.length-1;i>=0;i--)
		{
			System.out.println(chararray[i]);
		}

	}

}
