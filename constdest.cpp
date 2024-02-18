#include<iostream>
#include<string>
using namespace std;
class Student{
    private:
        string fullName;
        int rollNum;
        double semPercentage;
        string collegeName;
        int collegeCode;
    public:
        Student(string name,int no,double per,string cname,int code)
        {
            fullName=name;
            rollNum=no;
            semPercentage=per;
            collegeName=cname;
            collegeCode=code;
            cout<<"Student name : "<<fullName<<endl;
            cout<<"Student roll no : "<<rollNum<<endl;
            cout<<"Student sem percentage : "<<semPercentage<<endl;
            cout<<"Student college name : "<<collegeName<<endl;
            cout<<"College code : "<<collegeCode<<endl;
        }
        ~Student(){}
};
int main()
{
    string name,cname;
    int no,code;
    double per;
    cout<<"Enter student's name : ";
    getline(cin,name);
    cout<<"Enter student's roll no : ";
    cin>>no;
    cout<<"Enter student's sem percentage : ";
    cin>>per;
    cin.ignore();
    cout<<"Enter student's college name : ";
    getline(cin,cname);
    cout<<"Enter the college code : ";
    cin>>code;
    Student Ramjagan(name,no,per,cname,code);
}
