import java.util.*;

class ss4 
{
    public static void main(String args[]) 
	{
        System.out.println("Enter the number of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < r; i++) 
		{
            for (int j = 0; j < c; j++) 
			{
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < c; i++) 
		{
            for (int j = 0; j < r; j++) 
			{
                System.out.print(" " + mat[j][i]);
            }
            System.out.println();
        }
    }
}



/*import java.util.Scanner;
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
class ss4
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
	
}*/