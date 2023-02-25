package week1.day1;

public class Student {
	String studentName="Banu";
	int rollNo=100;
	String collegeName="Testleaf";
	long markScored=100;
	double cgpa=8.98;
	public void studentDetail()
	{
	System.out.println("Student name is:" +" "+studentName);
	System.out.println("Roll no:"+" "+rollNo);
	System.out.println("College Name:"+" "+collegeName);
	System.out.println("Mark:"+" "+markScored);
	System.out.println("CGPA:"+" "+cgpa);
	}	}

/*public static class Report
{
	public static void main(String[] args) {
		Student students=new Student();
	//	Report reports=new Report();
		students.studentDetail();	
	}
}
}*/