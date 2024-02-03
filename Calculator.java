import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number 1 ");
        double a=s.nextDouble();
        System.out.print("Enter number 2 ");
        double b=s.nextDouble();
        System.out.println("1.Addition  2.Subtraction   3.Multiplication    4.Division");
        System.out.print("Enter choice ");
        int choice=s.nextInt();
        if(choice==1)
        {
            System.out.println(a+" + "+b+" = "+(a+b));
        }
        else if(choice==2)
        {
            System.out.println(a+" - "+b+" = "+(a-b));
        }
        else if(choice==3)
        {
            System.out.println(a+" * "+b+" = "+(a*b));
        }
        else if(choice==4)
        {
            System.out.println(a+" / "+b+" = "+(a/b));
        }
        else
        {
            System.out.println("Invalid choice");
        }
        s.close();
    }
}
