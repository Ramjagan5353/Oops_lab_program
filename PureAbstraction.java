interface Area
{
    void area();//abstract public void area();
}
interface Perimeter
{
    void perimeter();//abstract public void perimeter();
}
//from using interface we can avoid multiple inheritance..
class Rectangle implements Area,Perimeter{
float length, breadth;
 Rectangle(float length,float breadth)
{
      this.length=length;
      this.breadth=breadth;
}
public void area()
{
   System.out.println("Area of Rectangle is length * breadth");
    System.out.print(length*breadth+"\n");
}
public void perimeter()
{
    System.out.println("Area of Rectangle is 2*(length+breadth)");
    System.out.print(2*(length+breadth));
}
}
public class interface_ex{
    public static void main(String[] args) {
    Rectangle x = new Rectangle(5,4);
     x.area();
     x.perimeter();
}
}      
