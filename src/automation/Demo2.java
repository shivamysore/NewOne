package automation;

public class Demo2 {

	
    int empid;
      String empname;
    Demo2(int e,String n)  
    {
    	empid = e;
    	empname =n;
	}
void test()
{
System.out.println(empid + "  " + empname);

}
public static void main(String[] args) 
{
	Demo2 x = new Demo2(100,"chandrakant");
	x.test();
	
}	


}
