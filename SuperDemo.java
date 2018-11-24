/*Objective is to show the use of super and this keyword with a constructor, methods, variables.*/

import java.io.IOException;

import java.util.Scanner;
class Student
{
	String Name;
	String Roll;
	int Sub1_marks;
	int Sub2_marks;
	int Sub3_marks;
	int total;
	Student()
	{
		System.out.println("***Demo of Super & this keyword with variables, methods and Constructor***");
	}
	int MarksTotal(int m1,int m2,int m3)
	{
		m1=this.Sub1_marks;// use of this keyword with variables
		m2=this.Sub2_marks;
		m3=this.Sub3_marks;
		total = m1+m2+m3;	
		System.out.println("Total marks of student "+Name+" are - "+this.total);
		return total;
	}
	
	void display()
	{
		System.out.println("***Student Information***");
	}
	
}


class College extends Student

{
public String ClgName;
public String DeptName;

College() //Constructor method for class college
{
	super();
}

// We have declared a method with the same name as parent class method name.
// But the result will be displayed is of Parent and child class here.
void display()
{
	super.display();//use of "super" with methods
	System.out.println("Name of the Student - "+super.Name);//use of super keyword with variables
	System.out.println("Roll No of the Student - "+super.Roll);//use of super keyword with variables
	System.out.println("Subject 1 Marks - "+super.Sub1_marks);//use of super keyword with variables
	System.out.println("Subject 2 Marks - "+super.Sub2_marks);//use of super keyword with variables
	System.out.println("Subject 3 Marks - "+super.Sub3_marks);//use of super keyword with variables
	//System.out.println("Total marks of student "+super.Name+" are - "+super.total);//use of super keyword with variables
	System.out.println("***College Information***");
	System.out.println("Name of the College - "+ClgName);
	System.out.println("Name of the Department - "+DeptName);
	
}
}
public class SuperDemo extends College
{
	public static void main(String[] args) throws IOException
	{
		College c=new College();// constructor of college is called inturn this will call the constructor of Parent class
		
		Scanner r=new Scanner(System.in); // Using Scanner class to read input from user.
		/* Provide the college and student info */
		System.out.println("Enter College Name");
		c.ClgName=r.nextLine();
		System.out.println("Enter Department Name");
		c.DeptName=r.nextLine();
		System.out.println("Enter Student Name");
		c.Name=r.nextLine();
		System.out.println("Enter Roll No");
		c.Roll=r.next();
		System.out.println("Enter Subject 1 Marks");
		c.Sub1_marks=r.nextInt();
		System.out.println("Enter Subject 2 Marks");
		c.Sub2_marks=r.nextInt();
		System.out.println("Enter Subject 3 Marks");
		c.Sub3_marks=r.nextInt();
		c.display(); // Calling display method "which in turn displays first the parent class message 
		            // and then the child class message "		
		c.MarksTotal(c.Sub1_marks, c.Sub2_marks, c.Sub3_marks); //Calling MarksTotal Method which 
		//inturn returns the summation result of sub1_marks, sub2_marks, sub3_marks.
		r.close();
	}

}
