import java.util.Scanner;
abstract class order
{
 int id;
 String desp;
 order(int id,String desp)
 {
  this.id=id;
  this.desp=desp;
 }
 abstract void display();
}
class purchesorder extends order
{
    String cname;
    purchesorder(int id,String desp,String cname)
    {
                super(id,desp);
  this.cname=cname;
 } 
 
    void display()
    {
  System.out.println("-----DETAIL FOR PURCHESORDER-----");
                System.out.println("ID ="+id);
  System.out.println("DESCRIPTION ="+desp);
  System.out.println("COSTOMER NAME ="+cname);
  System.out.println();
    }  
 
}
class salesorder extends order
{
    String vname;
    salesorder(int id,String desp,String vname)
    {
              super(id,desp);
  this.vname=vname;
    } 
    void display()
    {
  System.out.println("-----DETAIL FOR SALESORDER-----");
                System.out.println("ID ="+id);
  System.out.println("DESCRIPTION ="+desp);
  System.out.println("VANDOR NAME ="+vname);
  System.out.println();
    }  
 
}
public class s6
{
 public static void main(String[] args)
 {
  int i;
  Scanner s=new Scanner(System.in);
  purchesorder []pur=new purchesorder[3];
  salesorder []sal=new salesorder[3];
  for(i=0;i<3;i++)
         {
                        System.out.println("Enter the Detail for purches oreder : "+(i+1));
   System.out.print("Enter id : ");
   int id=s.nextInt();
   System.out.print("Enter description : ");
   String desp=s.next();
   System.out.print("Enter name : ");
   String cname=s.next();
                        pur[i]=new purchesorder(id,desp,cname);
                        System.out.println();
  } 
                for(i=0;i<3;i++)
         {
                        System.out.println("\nEnter the Detail for Sales oreder : "+(i+1));
   System.out.print("Enter id : ");
   int id=s.nextInt();
   System.out.print("Enter description : ");
   String desp=s.next();
   System.out.print("Enter name : ");
   String vname=s.next();
                        sal[i]=new salesorder(id,desp,vname);
        } 
                for(i=0;i<3;i++) 
  {
   //System.out.println("Detail");
   pur[i].display();
   sal[i].display();  
  }
  
 }
}