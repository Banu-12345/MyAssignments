package Week3day2;

public class FindWordwithJoyBoyExample {

	public static void main(String[] args) {
	
		String s= "luffy is still joyboy";
		String[] s1=s.split(" ");
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(s1[i]);
		}
System.out.println("Last word is: "+s1[s1.length-1]+" "+"and lenght is: "+(s1[s1.length-1]).length());
	}

}
