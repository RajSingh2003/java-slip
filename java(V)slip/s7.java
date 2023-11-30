import java.util.*;
import java.io.*;
class s7
{
     public static void main(String [] args)throws IOException
     {
        
          FileReader f=new FileReader("samp.txt");
          Scanner s=new Scanner(f);
          String str,str1;
          while(s.hasNext())
          {
               StringBuilder st=new StringBuilder();
               str=s.next();
               str1=str.toUpperCase();
               st.append(str1);
               st.reverse();
               System.out.print(st);
               
          }
          f.close();
     }
}