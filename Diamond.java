class A{
    void displayA()
    {
        System.out.println("I am from class A");
    }
}
class B extends A{
    void displayB()
    {
        System.out.println("I am from class B");
    }
}
class C extends A{
    void displayC()
    {
        System.out.println("I am from class C");
    }
}
/* 
class D extends B,C{

}  */
//Java doesn't support multiple inheritance
public class Diamond {
    public static void main(String[] args) {
        B obj1=new B();
        obj1.displayA();
        obj1.displayB();
        C obj2=new C();
        obj2.displayA();
        obj2.displayC();
    }
}
