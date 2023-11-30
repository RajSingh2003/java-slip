class s21
{
      int id=0;
      String name=" ";
      String dept=" ";
      double salary=0;
      
      s21(int id,String name,String dept,double salary)
      {
         this.id=id;
         this.name=name;
         this.dept=dept;
         this.salary=salary;
      }
      void show()
      {
           System.out.println("Enter Employee ID : "+id);
           System.out.println("Enter Employee Name : "+name);
           System.out.println("Enter Employee Department : "+dept);
           System.out.println("Enter Employee Salary : "+salary);
           System.out.println();
      }
     
      
      public static void main(String[] args)
      {
            s21 e=new s21(1,"Raj","BCS",500000000);
            s21 e1=new s21(2,"Amit","BSC",10000000);
            e.show();
            e1.show();
            
            
      }
}