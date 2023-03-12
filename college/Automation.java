package org.college;

public class Automation extends MultipleLanguage implements Language,TestTool
{

	public static void main(String[] args) {
		
		Automation auto=new Automation();
		auto.java();
		auto.python();
		auto.ruby();
		auto.Selenium();
			
}

	public void java() {
		System.out.println("I am good at java ");
		
	}

	@Override
	public void ruby() {
		System.out.println("I am good at ruby");
		
	}

	public void Selenium() {
		System.out.println("I am good at selenium");
		
	}
}
