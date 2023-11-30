import java.util.Scanner;
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
class ss6
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
/*




import java.util.*;
import java.io.*;
class ss6
{
	public static void main(String[] args)throws IOException
	{
		FileReader f=new FileReader("sample.txt");
		Scanner s=new Scanner(f);
		String c,c2;
		while(s.hasNext())
		{
			StringBuilder c1=new StringBuilder();
			c=s.next();
			c2=c.toUpperCase();
			c1.append(c2);
			c1.reverse();
			System.out.println(c1);
		}			
		f.close();
	}
}*/