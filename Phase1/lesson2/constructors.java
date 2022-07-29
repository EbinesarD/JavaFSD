package lesson2;

public class constructors 
{
	int empId;
	String empName;
	String department;
	float salary;
	// default constructor
	public constructors()
	{
		empId = 1;
		empName="Emp001";
		department="finance";
		salary = 35000;
	}
	// parametrized constructor
	public constructors(int empId, String empName, String department, float salary)
	{
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
	public void display()
	{
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args)
	{
		constructors c1 = new constructors();
		constructors c2 = new constructors(2,"John","Training",45000);
		c1.display();
		c2.display();
	}

}
