package Week3day2;

public class JavaChallengefoPalindrome {
	
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		boolean ispalindrome=false;
		String rev="";
		String s="A man, a plan, a canal: Panama";
		String concat=s.replaceAll("[^a-zA-Z0-9]","");
		String tolowercase=concat.toLowerCase();
		System.out.println(tolowercase);
		for(int i=tolowercase.length()-1;i>=0;i--)
		{
			char ch=tolowercase.charAt(i);
		    rev=rev+ch;
		    
		}
			if(rev.equals(tolowercase))
			{
				ispalindrome=true;
			System.out.println(ispalindrome+" "+ "is palindrome");
			}
			else
			{
				ispalindrome=false;
			System.out.println(rev+" "+"is not a palindrome");	
			}
		}
	}


