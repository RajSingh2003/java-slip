import java.util.Scanner;
public class s11
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = s.nextLine();

        System.out.print("Enter password: ");
        String password = s.nextLine();

        if (!username.equals(password)) 
		{
            System.out.println("Invalid Password: Username and password must be the same.");
        } 
		else 
		{
            System.out.println("Username and Password are the same. Access granted!");
        }
    }
}