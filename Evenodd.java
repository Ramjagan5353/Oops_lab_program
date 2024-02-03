import java.util.Scanner;
class Evenodd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter an integer :");
        int a=s.nextInt();
        if(a==0)
        {
            System.out.println(a+" is neither odd nor even");
        }
        else if(a>0)
        {
            if(a%2==0)
            {
                System.out.println(a+" is even");
            }
            else{
                System.out.println(a+" is odd");
            }
        }
        else
        {
            System.out.println("Enter a positive number");
        }
        s.close();
    }
}
