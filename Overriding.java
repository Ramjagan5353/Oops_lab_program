class Student{
    void display()
    {
        System.out.println("I am a student");
    }
}
class MVGRStudent extends Student{
    void display()
    {
        System.out.println("I am a student of MVGR");
    }
}
class Main{
    public static void main(String[] args) {
        MVGRStudent obj=new MVGRStudent();
        obj.display();
    }
}