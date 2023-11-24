package srcMadhuPack;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

class Driver1 
{
	static ArrayList<Employee> a=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public static void addEmployee()
	{
		System.out.println("--------- Enter details of an Employee --------- ");
		System.out.println("             ");
		System.out.println("Enter name : ");
		String name=sc.next();
		System.out.println("Enter eid : ");
		int eid=sc.nextInt();
		System.out.println("Enter salary : ");
		double salary=sc.nextDouble();
		Employee e=new Employee(name,eid,salary);
		a.add(e);
		System.out.println("Employee details added to ArrayList ");

		test1();
	}
	public static void displayDetails()
	{
		for (int i=0;i<a.size() ;i++ )
		{

			Employee e1=((Employee)a.get(i));
			System.out.println("Name : "+e1.getName());
			System.out.println("Eid : "+e1.getEid());
			System.out.println("Salary : "+e1.getSalary());
		}
		test1();
	}
	public static void searchEmp()
	{ 	
		System.out.println(" Enter Emp name");
		String n =sc.next();
		int count=0;
		for	(int i=0;i<a.size();i++)
		{
			Employee e1=(Employee)a.get(i);
			String n2=e1.getName();
			if(n.equalsIgnoreCase(n2)) 
			{
				System.out.println("name :"+e1.getName());
				System.out.println("eid :"+e1.getEid());
				System.out.println("salary :"+e1.getSalary());
				count++;
			}
		}
		if(count==0) {
			System.out.println("   ");
			System.out.println("<--------- Given details are not matching ----------->");
		}
		test1();	
	}
	public static void deleteEmp()
	{
		System.out.println("Enter the Eid number");
		int eid=sc.nextInt();
		int count=0;
		System.out.println("length of array is : "+a.size());
		for	(int i=0;i<a.size();i++)
		{
			Employee e1=(Employee)a.get(i);
			int eid1=e1.getEid();
			if(eid==eid1)
			{
				System.out.println("Eid details are present");
				System.out.println("Should you want to delete this Eid from the Record...?");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" Select Your Option "+" Yes or  NO ");
				String n =sc.next();
				try {
					if (n.equalsIgnoreCase("yes"))
					{
						a.remove(eid);
						System.out.println("Employee details Successfully deleted");
						System.out.println("name :"+e1.getName());
						System.out.println("eid :"+e1.getEid());
						System.out.println("salary :"+e1.getSalary());
						count++;
						break;
					}
					else if (n.equalsIgnoreCase("No")) 
						test1();
				}
				catch(Exception e) {
					System.out.println("Exception handled");
				}
			}
		}
		if(count==0)
			System.out.println(" Given details are not found");
		System.out.println("should you want to continue in same page");
		System.out.println("select your option  Y  or  N");
		String n =sc.next();
		if(n.equalsIgnoreCase("Y")) {
			deleteEmp();
		}
		else if(n.equalsIgnoreCase("N"))
			test1();	
	}
	public static void ascendingSalary()
	{
		System.out.println("sorting is based on eid number");
		for(int i=0;i<a.size();i++)
		{
         	Employee e1=(Employee)a.get(i);
            System.out.println("name :"+e1.getName());
            System.out.println("eid :"+e1.getEid());
			System.out.println("salary :"+e1.getSalary());
		}
		test1();	
	}
	public static void test1()
	{
		System.out.println("               ");
		System.out.println("               ");
		System.out.println("press 1 to continue");
		System.out.println("press any other number to stop the program");
		System.out.println("               ");
		System.out.println("               ");
		int n=sc.nextInt();
		if (n==1)
		{
			test();
		}
		else
			System.out.println("<-------------------------   THANK YOU   ---------------->");
	}
	public static void test()
	{
		System.out.println("             ");
		System.out.println("             ");
		System.out.println("press 1 to Create/add Employee to ArrayList ");
		System.out.println("press 2 to Display details of All Employees ");
		System.out.println("press 3 to Search an Employee ");
		System.out.println("press 4 to Delete an Employee ");
		System.out.println("press 5 to Display details of Employee in Ascending order ");
		System.out.println("             ");
		System.out.println("             ");

		int n=sc.nextInt();

		if (n==1)
		{
			addEmployee();
		}
		else if (n==2)
		{
			displayDetails();
		}
		else if (n==3)
		{
			searchEmp();
		}
		else if (n==4)
		{
			deleteEmp();
		}
		else if (n==5)
		{
			ascendingSalary();
		}
		else 
		{
			System.out.println("<--------------- Invalid choice -------------->");
			test1();
		}
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee("Madhu",04,4526.22);
		Employee e2=new Employee("Subbu",01,5621.75);
		Employee e3=new Employee("Bravo",02,7535.19);
		Employee e4=new Employee("Vasif",05,4620.34);
		Employee e5=new Employee("DPrasad",03,3554.23);
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		System.out.println("             ");
		System.out.println("             ");
		System.out.println("<------- * --     WELCOME      -- * -------->");   
		test();	
	}
}