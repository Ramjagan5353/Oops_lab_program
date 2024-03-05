class Animal{
    void display()
    {
        System.out.println("I was an animal");
    }
}
class Cat extends Animal{
    void type()
    {
        System.out.println("I was a cat ");
    }
}
public class Simple {
    public static void main(String[] args) {
        Cat obj=new Cat();
        obj.display();
        obj.type();
    }
}
