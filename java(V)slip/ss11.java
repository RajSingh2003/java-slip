
import java.util.Scanner;
interface operation
{
    void input();
    void output();
}
class cylinder implements operation
{
    double r,h;
    public void input()
    {
         Scanner s= new Scanner(System.in);
         System.out.println("Enter radius : ");
         r=s.nextDouble();
         System.out.println("Enter Height : ");
         h=s.nextDouble();
    }
    public void output()
    {
        //  double a=2*3.14*r*(r+h);
          double v=3.14*r*r*h;
          //System.out.println("Area of Cylinder : "+a);
          System.out.println("Volume of Cylinder : "+v);
    }
}

public class ss11
{
     public static void main(String[] args)
     {
          cylinder c=new cylinder();
          c.input();
          c.output();
     }
}



/*
class College 
{
    int cno;
    String cname;
    String caddr;

    public College(int cno, String cname, String caddr) {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }
}
class Department extends College 
{
    int dno;
    String dname;

    public Department(int cno, String cname, String caddr, int dno, String dname) 
	{
        super(cno, cname, caddr); 
        this.dno = dno;
        this.dname = dname;
    }
}

public class ss11
 {
    public static void main(String[] args) 
	{
        College c = new College(1, "ryk", "clg road");
        Department d = new Department(1, "ryk", "clg road", 101, "Computer Science");

        System.out.println("College Information:");
        System.out.println("College Number: " + c.cno);
        System.out.println("College Name: " + c.cname);
        System.out.println("College Address: " + c.caddr);

        System.out.println("\nDepartment Information:");
        System.out.println("Department Number: " + d.dno);
        System.out.println("Department Name: " + d.dname);
    }
}*/