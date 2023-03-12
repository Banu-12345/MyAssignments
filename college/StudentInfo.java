package org.college;

public class StudentInfo {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student1 ID is"+" " +id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student2 id and name is"+ " " +id+ " "+name);
	}
	public void getStudentInfo(String email, long phonenum)
	{
		System.out.println("Student mail and phone num is"+" " +email+ " " +phonenum);
	}

	public static void main(String[] args) 
	{
		StudentInfo sinfo=new StudentInfo();
		sinfo.getStudentInfo(111);
		sinfo.getStudentInfo(123, "Banu");
		sinfo.getStudentInfo("dhilshathbanu92@gmail.com", 9176796779L);
		
	}

}
