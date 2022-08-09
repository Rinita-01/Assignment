package OOPS_CC;

	import java.util.Scanner;

	class Info
	{
		int id;
		String name;
		String designation;
		long salary;
		int ta=1000;
		static String comname="XYZ";
		void setData(int id,String name,String designation,long salary)
		{
			this.id=id;
			this.name=name;
			this.designation=designation;
			this.salary=salary;
		}
		void getApprisal(int doj,int currentYear)
		{
			if(currentYear-doj>1)
			{
			float totalSalary=(float)salary+(float)(salary*0.1f);
			System.out.println("Salary: "+totalSalary);
			}
			else
				System.out.println("Salary: "+salary);
			
		}
		void TA()
		{
			if(designation.equalsIgnoreCase("manager"))
			{
				ta=3000;
				System.out.println("Travel Allowance: "+ta);
			}
			else
			{
				System.out.println("Travel Allowance: "+ta);

			}
			
				
		}
		void display()
		{
			System.out.println("Id: "+id+"\nName:"+name+"designation:"+designation);
		}
	}
	public class StaticBlock {
		
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			Info emp=new Info();
			System.out.println("Enter id: ");
			int i=sc.nextInt();
			System.out.println("Enter the name: ");
			String n=sc.next();
			System.out.println("Enter designtion: ");
			String d=sc.next();
			System.out.println("Enter basic salaray: ");
			long s=sc.nextLong();
			System.out.println("enter the year of join: ");
			int doj=sc.nextInt();
			System.out.println("enter the current year: ");
			int cyear=sc.nextInt();
			emp.setData(i, n, d, s);
			System.out.println("======================================");
			System.out.println(Info.comname);
			emp.display();
			emp.getApprisal(doj,cyear);
			emp.TA();
			

			
		
			
		}
	}


