#include<iostream>
#include<string>
using namespace std;
class Student{
    private:
        string S_fullName;
        double S_semPercentage;
        string collegeName;
        int collegeCode;
    public:
        Student()
        {
            collegeName="MVGR";
            collegeCode=33;
            cout<<"College name : "<<collegeName<<endl;
            cout<<"College code : "<<collegeCode<<endl;
        }
        Student(string fullName,double semPercentage)
        {
            S_fullName=fullName;
            S_semPercentage=semPercentage;
            cout<<"Student name : "<<S_fullName<<endl;
            cout<<"Student's sem percentage : "<<S_semPercentage<<endl;
        }
        ~Student(){}
};
int main()
{
    string name;
    double per;
    cout<<"Enter student's name : ";
    getline(cin,name);
    cout<<"Enter student's sem percentage : ";
    cin>>per;
    Student S(name,per);
    Student S1;
}
