public class Public {
    public int pub=1;
    protected int pro=2;
    private int pri=3;
    public int getpri()
    {
        return pri;
    }
}
class Subclass extends Public{

}
class Main{
    public static void main(String[] args) {
        Subclass S=new Subclass();
        System.out.println("Public variable : "+S.pub);
        System.out.println("Protected variable : "+S.pro);
        System.out.println("Private variable : "+S.getpri());
    }
}