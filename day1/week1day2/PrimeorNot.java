package week1.day2;

public class PrimeorNot 
{

	private static final boolean False = false;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int num=3;
boolean flag=false;
if(num>1)
{
	for(int i=3;i<num;i++)
	{
		if(num%i==0)
	    flag=true;
		break;
	}

	if(flag==False)
	{
		System.out.println("Given number is prime");
	}
	else
	{
		System.out.println("Not a prime number");
	}
}
else
	System.out.println("Invalid number");
}
	}
