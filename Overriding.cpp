#include<iostream>
using namespace std;
class Student
{
    public:
        void display()
        {
            cout<<"I am a student"<<endl;
        }
};
class MVGRStudent : Student{
    public:
        void display()
        {
            cout<<"I am a student of MVGR"<<endl;
        }
};
int main()
{
    MVGRStudent obj;
    obj.display();
}
