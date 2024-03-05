class ClassA{
    void A(){
        System.out.println("I am from class A");
    }
}
class ClassB extends ClassA{
    void B(){
        System.out.println("I am from class B derived from class A");
    }
}
class ClassC extends ClassB{
    void C(){
        System.out.println("I am from class C derived from class B");
    }
}
class ClassD extends ClassA{
    void D(){
        System.out.println("I am from class D derived from class A");
    }
}
class ClassE extends ClassA{
    void E()
    {
        System.out.println("I am from class E derived from class A");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Simple inheritance");
        ClassB x = new ClassB();
        x.A();
        x.B();
        System.out.println("Multi-Level inheritance");
        ClassC y = new ClassC();
        y.A();
        y.B();
        y.C();
        System.out.println("Hierarchial inheritance");
        ClassD z1 = new ClassD();
        ClassE z2=new ClassE();
        z1.A();
        z1.D();
        z2.A();
        z2.E();
    }
}
