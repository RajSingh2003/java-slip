import java.util.Scanner;
class continent
{
	String cname;
	continent(String cname)
	{
		this.cname=cname;
	}
}
class country extends continent
{
	String coname;
	country(String cname,String coname)
	{
		super(cname);
		this.coname=coname;
	}
}
class state extends country
{
	String sname;
	state(String cname,String coname,String sname)
	{
		super(cname,coname);
		this.sname=sname;
	}
}
class ss5
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Continent Name :");
		String cname=s.next();
		System.out.println("Enter counrty Name :");
		String coname=s.next();
		System.out.println("Enter state Name :");
		String sname=s.next();
		System.out.println("Enter place Name :");
		String place=s.next();
		
		System.out.println("Details..");
		System.out.println("Continent Name :"+cname);
		System.out.println("Country Name :"+coname);
		System.out.println("State Name :"+sname);
		System.out.println("Place Name :"+place);
		
	}
	
}


/*import java.util.Scanner;
class emp
{
	int eid;
	String ename,edept;
	double sal;
	emp(int eid,String ename,String edept,double sal)
	{
		this.eid=eid;
		this.ename=ename;
		this.edept=edept;
		this.sal=sal;
	}
	public String toString()
	{
		return "\nEmployee Id="+eid+
		       "\nEmployee name:"+ename+
               "\nEmployee Designation: "+edept+
			   "\nEmployee salary:"+sal;
		
	}
}
class ss5
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		emp e=new emp(1,"Raaz","Bcs",100000);
		emp e1=new emp(2,"Rz","Bsc",50000);
		System.out.println(e.toString());
		System.out.println(e1.toString());
		
		
	}
	
}
*/