package automation;

public class Demo 
{
	int empid;
	String empname;
	String department;
	double salary;
	
	Demo(int e,String n)
	{
		empid = e;
		empname =n;
	}

	
	Demo(int e,String n,String d)
	{
		empid =e;
		empname =n;
		department =d;
	}
	Demo(int e,String n,String d,double s)
	{
		empid =e;
		empname =n;
		department =d;
		salary =s;
	}
	void test()
	{
System.out.println(empid + " " + empname + " " +department + " " + salary);
	}
public static void main(String[] args) 
{
	Demo x = new Demo(105,"Ramesh");
	x.test();
	  Demo x1 = new Demo(105,"Ramesh","testing");
	  x1.test();
	  Demo x2 = new Demo(105,"Ramesh","testing",50000.00);
	  x2.test();
}
	
}
