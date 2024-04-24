public class ExHandling
{
    public static void main(String[] args)
    {
         try
        {
            Class.forName("DoesNotExist");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class Not Found ");
        }
         try
        {
            int arr[]={1,2,3,4,5};
            System.out.println(arr[8]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of range");
        }
        try
        {
            String s=null;
            @SuppressWarnings("null")
            int l=s.length();
            System.out.println(l);
        }
        catch(NullPointerException e)
        {
            System.out.println("Null pointer : "+e.getMessage());
        }
         try
        {
            int temp=10/0;
            System.out.println(temp);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception");
        }
    }
}
