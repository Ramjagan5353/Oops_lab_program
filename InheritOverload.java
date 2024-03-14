import java.util.*;
class Student{
    void display()
    {
        System.out.println("I am a student");
    }
}
class MVGRStudent extends Student{
    void display(String name)
    {
        System.out.println("My name is "+name);
        System.out.println("I am a student of MVGR");
    }
}
class Main{
    public static void main(String[] args) {
        MVGRStudent obj=new MVGRStudent();
        Scanner s=new Scanner(System.in);
        obj.display();
        System.out.print("Enter your name : ");
        String name=s.nextLine();
        obj.display(name);
    }
}