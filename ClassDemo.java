import java.util.Scanner;
class StudentDemo
{
	Scanner sc = new Scanner(System.in);
	
	int rollno;
	String name;
	double fees;
	void input()
	{
		System.out.println(" Enter the RollNo : ");
		rollno = sc.nextInt();
		System.out.println(" Enter the Name : ");
		name = sc.next();
		System.out.println(" Enter the Fees : ");
		fees = sc.nextDouble();
	}
	void output()
	{
		System.out.println(" RollNo = "+rollno);
		System.out.println(" Name = "+name);
		System.out.println(" Fees = "+fees);
	}
	
	public static void main(String args[])
	{
		StudentDemo SD = new StudentDemo();
		SD.input();
		SD.output();
	}
}