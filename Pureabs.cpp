#include<iostream>
using namespace std;
class Student{
public:
virtual void type()=0;
};
class FrontBench : public Student{
public:
    void type()
    {
        cout<<"Ram - I am a frontbench Student"<<endl;
    }
};
class BackBench : public Student{
public:
    void type()
    {
        cout<<"Jagan - I am a backbench Student"<<endl;
    }
};

int main()
{
    FrontBench sai;
    ram.type();
    BackBench bhaskar;
    jagan.type();
}
