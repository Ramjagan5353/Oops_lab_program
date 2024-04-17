abstract class shape
{
       abstract void perimeter();
        void display(){}
 } 
class rectangle extends shape
{
              float l,b;
         rectangle(float l,float b)
        {
                 this.l=l; 
                 this.b=b; 
         }
           void perimeter()
          { 
                   System.out.println(2*(l+b));
            } 
} 
class triangle extends shape
{
          float l,b,h; 
          triangle(float l,float b,float h)
          {
              this.l=l; 
              this.b=b;
              this.h=h;
           }
             void perimeter()
            {
               System.out.println(l+b+h);
            }
       } 
 public class PartialAbs { 
               public static void main(String[] args) 
                { 
                     rectangle x= new rectangle(1.2f, 2.3f); 
                     triangle y = new triangle(1, 2, 3); 
                     System.out.print("perimeter of rectangle : ");
                     x.perimeter();
                     System.out.print("perimeter of triangle : "); 
                     y.perimeter(); 
               
                }
 }
