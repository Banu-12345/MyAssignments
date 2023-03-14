package Week3day2;

public class FindHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Hello World";
	//	char[] input1 = input.toCharArray();
		
	String[] split=input.split(" ");
for(int i=0;i<=split.length-1;i++)
{
System.out.println(split[i]);	
}
System.out.println("2nd word is"+" "+split[1]+ "\n"+"Length is"+" "+split[1].length());
	}

}
