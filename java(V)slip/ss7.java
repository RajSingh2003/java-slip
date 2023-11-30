class Bank 
{
    double balance;

    public Bank() 
	{
        balance = 0;
    }

    public Bank(double initialBalance) 
	{
        balance = initialBalance;
    }

    public void deposit(double amount) 
	{
        balance = balance + amount;
    }

    public void withdraw(double amount) 
	{
        balance = balance - amount;
    }

    public double getBalance() 
	{
        return balance;
    }
}
class ss7{
    public static void main(String[] args) 
	{
        Bank b = new Bank(1000);
        b.withdraw(250);
        System.out.println("The withdraw is: " + b.balance);
        b.deposit(400);
        System.out.println("The deposit is: " + b.balance);
        System.out.println("The balance is: " + b.getBalance());
    }
}



/*import java.util.Scanner;
class sphere
{
	int r;
	sphere(int r)
	{
		this.r=r;
	}
	public void area()
	{
		double a;
		a=4*3.14*(r*r);
		System.out.println("Surface Area: " +a );
	}
	public void volume()
	{
	
	    double v;
	    v=(4/3)*3.14*(r*r*r);
		System.out.println("Volume: " +v);
	}
}

class ss7
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the radius of the sphere: ");
        int r = s.nextInt();
		sphere e=new sphere(r);
		e.area();
		e.volume();
		
	}
	
}*/