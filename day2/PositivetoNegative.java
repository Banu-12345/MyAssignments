package week1.day2;

public class PositivetoNegative {

public static void main(String[] args)
{
int num=40;
int num1=num;
if(num<0)
{
num1=num1*-1;
System.out.println("Given num is negtive:"+num +"\n" +"Positive num is:" +num1);
}
else if(num>0)
{	
num1=num1*-1;	
System.out.println("Given num is positive:"+num +"\n" +"Negative num is:" +num1);
}
else
{
System.out.println("The given num is neither positive nor negative");	
}
}
}
