#include<iostream>
using namespace std;
class Student{
    public:
    void display()
    {
        cout<<"I am a student"<<endl;
    }
    void display(string college)
    {
        cout<<"I am a student of "<<college<<endl;
    }
};
int main()
{
    Student obj;
    obj.display();
    string name;
    cout<<"Enter your college name : ";
    cin>>name;
    obj.display(name);
}