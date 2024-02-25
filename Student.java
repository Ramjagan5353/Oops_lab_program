import java.util.*;
class Student {
   String fullName;
   int rollNum;
   double semPercentage;
   String collegeName;
   int collegeCode;
   Student(String name,int roll,double per,String cname,int code)
   {
       this.fullName=name;
       this.rollNum=roll;
       this.semPercentage=per;
       this.collegeName=cname;
       this.collegeCode=code;
       System.out.println("Student name : "+fullName);
       System.out.println("Student roll no : "+rollNum);
       System.out.println("Student's sem percentage : "+semPercentage);
       System.out.println("College name : "+collegeName);
       System.out.println("College code : "+collegeCode);
   }
}
class Main{
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String name,cname;
       int roll,code;
       double per;
       System.out.print("Enter student's name : ");
       name=s.nextLine();
       System.out.print("Enter student's roll no : ");
       roll=s.nextInt();
       System.out.print("Enter student's sem percentage : ");
       per=s.nextDouble();
       s.nextLine();
       System.out.print("Enter college name : ");
       cname=s.nextLine();
       System.out.print("Enter college code : ");
       code=s.nextInt();
       Student jagan=new Student(name,roll,per,cname,code);
       s.close();
   }
}
