import java.util.*;
class Student{
    void display()
    {
        System.out.println("I am a student");
    }
    void display(String name)
    {
        System.out.println("I am a student of "+name);
    }
}
class Main{
    public static void main(String[] args) {
        Student obj=new Student();
        Scanner s=new Scanner(System.in);
        obj.display();
        System.out.print("Enter your college name : ");
        String name=s.nextLine();
        obj.display(name);
        s.close();
    }
}