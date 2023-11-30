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
class MyNumber
{
     private int no;
     MyNumber(){
         no=0;
     }
     MyNumber(int no)
     {
          this.no=no;
     }    
     void negative(){
          if(no<0)
             System.out.println(+no+ "is Negative..");
     }
     void positive(){
          if(no>0)
             System.out.println(+no+ "is Positive");
     }
     void zero(){
          if(no==0)
             System.out.println(+no+ "is Zero..");
     }
     void even(){
          if(no%2==0)
             System.out.println(+no+ "is EVEN..");
     }
      void odd(){
          if(no%2!=0)
             System.out.println(+no+ "is ODD..");
     }
             
     public static void main(String[] args)
     {
          System.out.println("Enter Number : ");
          Scanner s=new Scanner(System.in);
          int no=s.nextInt();
          
          MyNumber m=new MyNumber(no);
          m.positive();
          m.negative();
          m.zero();
          m.even();
          m.odd();
     }
     
     
     
             
     
}*/