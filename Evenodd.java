import java.util.Scanner;
class Evenodd {
    public static void evenodd(int a)
    {
        if(a==0)
        {
            System.out.println(a+" is neither odd nor even");
        }
        else
        {
            if(a%2==0)
            {
                System.out.println(a+" is even");
            }
            else
            {
                System.out.println(a+" is odd");
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter an integer :");
        int a=s.nextInt();
        evenodd(a);
        s.close();
    }
}
