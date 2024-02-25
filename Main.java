import java.util.*;
class Student{
   String collegeName,fullName;
   int collegeCode;
   double semPercentage;
   Student()
   {
       this.collegeName="MVGR";
       this.collegeCode=33;
       System.out.println("College name : "+collegeName);
       System.out.println("College code : "+collegeCode);
   }
   Student(String name,double per)
   {
       this.fullName=name;
       this.semPercentage=per;
       System.out.println("Student name : "+fullName);
       System.out.println("Student's sem percentage : "+semPercentage);
   }
}
public class Main {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String name;
       double per;
       System.out.print("Enter student's name : ");
       name=s.nextLine();
       System.out.print("Enter student's sem percentage : ");
       per=s.nextDouble();
       Student S1=new Student(name,per);
       Student S2=new Student();
       s.close();
   }
}
