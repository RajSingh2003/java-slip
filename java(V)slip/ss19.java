
import java.util.Scanner;
class ss19
{
      int i,j,k,r1,c1,r2,c2,suml=0,sumr=0;
      Scanner s=new Scanner(System.in);  
      void dig()
      {
           System.out.println("Enter Row and Column of Matrix::");
           r1=s.nextInt();
           c1=s.nextInt();
           int a[][]=new int[r1][c1];
           int b[][]=new int[5][5];
           System.out.println("Enter Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 a[i][j]=s.nextInt();
              }
           }
           System.out.println(" Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 System.out.print(a[i][j]+" ");
              }
              System.out.print("\n");
           }
            for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
				 if(i==j)
					 suml+=a[i][j];
				 if(i+j==r1-1)
					sumr+=a[i][j]; 
				 
              } 
           }
		   System.out.println("sum of digonal Elements::::");
		   System.out.println("sum of Left digonal Elements:"+suml);
		   System.out.println("sum of Right digonal Elements:"+sumr);
		   
	  }		   
      public static void main(String[] args)
      {
            Scanner sc=new Scanner(System.in);
            ss19 a =new ss19();
            a.dig();
      }

}






/*import java.util.Scanner;

abstract class Shape {
    protected int side1;
    protected int side2;

    public Shape(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void printArea() {
        int area = side1 * side2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    public void printArea() {
        double area = 0.5 * side1 * side2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);
    }

    @Override
    public void printArea() {
        double area = Math.PI * side1 * side1;
        System.out.println("Area of Circle: " + area);
    }
}

public class ss19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        Shape shape = null;
        int side1, side2;

        switch (choice) {
            case 1:
                System.out.print("Enter the length of the rectangle: ");
                side1 = scanner.nextInt();
                System.out.print("Enter the width of the rectangle: ");
                side2 = scanner.nextInt();
                shape = new Rectangle(side1, side2);
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                side1 = scanner.nextInt();
                System.out.print("Enter the height of the triangle: ");
                side2 = scanner.nextInt();
                shape = new Triangle(side1, side2);
                break;
            case 3:
                System.out.print("Enter the radius of the circle: ");
                side1 = scanner.nextInt();
                shape = new Circle(side1);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        if (shape != null) {
            shape.printArea();
        }

    }
}*/