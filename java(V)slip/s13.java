import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class s13
{
       public static void main (String[] args)
       {  
              Date date=new Date();
              SimpleDateFormat df=new  SimpleDateFormat("dd/mm/yyyy");
              System.out.println("Current date is : "+df.format(date));
              SimpleDateFormat df1=new  SimpleDateFormat("EEEEEE MMMM dd yyyy");
              System.out.println("Current date is : "+df1.format(date));
              SimpleDateFormat df2=new  SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
              System.out.print("Current date is : "+df2.format(date));
              SimpleDateFormat df3=new  SimpleDateFormat("dd/mm/yy HH:mm:ss a z");
              System.out.println("Current date is : "+df3.format(date));
              SimpleDateFormat df4=new  SimpleDateFormat("hh:mm:ss");
              System.out.println("Current time is : "+df4.format(date));
             
       }
}