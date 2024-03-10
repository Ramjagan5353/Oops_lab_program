import java.util.*;
public class AccessSpecifierDemo {
   public int pubVar;
   protected int proVar;
   private int priVar;
   public void setVar(int priValue,int proValue,int pubValue)
   {
       pubVar=pubValue;
       proVar=proValue;
       priVar=priValue;
   }
   public void getVar()
   {
       System.out.println("Public variable : "+pubVar);
       System.out.println("Protected variable : "+proVar);
       System.out.println("Private variable : "+priVar);
   }
}
class Main{
   public static void main(String[] args) {
       AccessSpecifierDemo obj=new AccessSpecifierDemo();
       Scanner S=new Scanner(System.in);
       int priValue,proValue,pubValue;
       System.out.print("Enter private,protected,public variable : ");
       priValue=S.nextInt();
       proValue=S.nextInt();
       pubValue=S.nextInt();
       obj.setVar(priValue,proValue,pubValue);
       System.out.println("The member variables are");
       obj.getVar();


   }
}
