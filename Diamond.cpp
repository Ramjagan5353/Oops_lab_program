#include<iostream>
using namespace std;
class parent{
    public:
        void display1()
        {
            cout<<"I am parent"<<endl;
        }
};
class child1 : public parent{
    public:
        void display2()
        {
            cout<<"I am child1"<<endl;
        }
};
class child2 : public parent{
    public:
        void display3()
        {
            cout<<"I am child2"<<endl;
        }
};
class grandchild : public child1,public child2{
    public:
        void display4()
        {
            cout<<"I am grandchild"<<endl;
        }
};
int main()
{
    grandchild obj;
    //obj.display1();
    obj.display2();
    obj.display3();
    obj.display4();
}
