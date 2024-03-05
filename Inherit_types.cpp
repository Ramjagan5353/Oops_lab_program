#include<iostream>
using namespace std;
class A{
    public:
        void displayA()
        {
            cout<<"I am from class A"<<endl;
        }
};
//Simple
class subA:public A{
public:
    void displaysubA()
    {
        cout<<"I am from class subA,derived from class A"<<endl;
    }
};
class B{
public:
    void displayB()
    {
        cout<<"I am from class B"<<endl;
    }
};
//Hierarchical
class subB1:public B{
public:
    void displayB1()
    {
        cout<<"I am from class B1,derived from class B"<<endl;
    }
};
//Hierarchical
class subB2:public B{
public:
    void displayB2()
    {
        cout<<"I am from class B2,derived from class B"<<endl;
    }
};
class C:public A{
public:
    void displayC()
    {
        cout<<"I am from class C,derived from class A"<<endl;
    }
};
class D:public A{
public:
    void displayD()
    {
        cout<<"I am from class D,derived from class A"<<endl;
    }
};
//Hybrid
class E:public C,public D{
public:
    void displayE()
    {
        cout<<"I am from class E,derived from class C and D"<<endl;
    }
};
//Multiple
class F:public A,public B{
public:
    void displayF()
    {
        cout<<"I am from class F,derived from class A and B"<<endl;
    }
};
//Multilevel
class sub_subA:public subA{
public:
    void display()
    {
        cout<<"I am derived from subclass of A"<<endl;
    }
};
int main()
{
    cout<<"Simple inheritance"<<endl;
    subA obj1;
    obj1.displayA();
    obj1.displaysubA();
    cout<<"Hierarchical inheritance"<<endl;
    subB1 obj2;
    subB2 obj3;
    obj2.displayB();
    obj2.displayB1();
    obj3.displayB2();
    cout<<"Multiple inheritance"<<endl;
    F obj4;
    obj4.displayF();
    cout<<"Multilevel inheritance"<<endl;
    sub_subA obj5;
    obj5.display();
    cout<<"Hybrid inheritance"<<endl;
    E obj6;
    //obj6.displayA();
    obj6.displayC();
    obj6.displayD();
    obj6.displayE();
}
