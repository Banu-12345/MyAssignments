package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1212;

int num1=num;
int rev=0;
for(;num>0;num=num/10) {
rev=rev*10+num%10;
//num=num/10;
}
System.out.println(rev);
if(num1==rev)
{
System.out.println("it is a palimdrom");
}
else
	System.out.println("it is not a palindrome");
}
}

