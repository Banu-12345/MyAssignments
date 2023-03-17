package Week3day2;

public class JavaChallengePalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" race a car";
		String rev="";
		boolean flag=false;
		String str2= str.replace(" ", "");
		System.out.println(str2);
		for(int i=str2.length()-1;i>=0;i--)
		{
			char ch=str2.charAt(i);
			rev=rev+ch;
			
		}
			if(str2.equals(rev))
			{
				flag=true;
				System.out.println(flag+" "+"It is palindrome");
			}
				else
				{
					flag=false;
					System.out.println(flag+" "+"It is not a palindrome");
				}
			}
		

	}


