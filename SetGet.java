import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Student
{
	//Student Information as provided in the statement
	private String sName;
	private String sRoll;
	private long sPh_no;
	private String sClass;
	
	public void setStudentInfo() throws IOException  //using SET method to give the values for the Student
	{
		/* Use of BufferedReader and Scanner classes to SET the values for the private data members from console*/
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("*** Provide the Student Information ***");
		System.out.println("Enter Student Name - ");
		sName=br.readLine();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Roll No - ");
		sRoll=sc.next();	
		System.out.println("Enter Student Phone Number - ");
		sPh_no=sc.nextLong();
		System.out.println("Enter Student Class - ");
		sClass=br.readLine();
		sc.close();
	}
	public void getStudentInfo() //using GET method to display the Student information
	{
		System.out.println("*** STUDENT INFORMATION ***");
		System.out.println("Student Name - "+sName);
		System.out.println("Student Roll No - "+sRoll);
		System.out.println("Student Phone Number - "+sPh_no);
		System.out.println("Student Class - "+sClass);
	}
}
public class SetGet 
{
	public static void main(String[] args) throws IOException 
	{
		Student s=new Student();
		s.setStudentInfo();// calling SET method using Student object
		s.getStudentInfo();//calling GET method using Student object
	}

}
