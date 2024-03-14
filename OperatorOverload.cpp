#include<iostream>
using namespace std;
class OpOverload{
    public:
    float real,imag;
    OpOverload(float r=0,float i=0)
    {
        real=r;
        imag=i;
    }
    OpOverload operator+(OpOverload obj)
    {
        OpOverload temp;
        temp.real=real+obj.real;
        temp.imag=imag+obj.imag;
        return temp;
    }
};
int main()
{
    float a,b;
    cout<<"Enter the real and imaginary values of number1 : ";
    cin>>a>>b;
    OpOverload obj1(a,b);
    cout<<"Enter the real and imaginary values of number2 : ";
    cin>>a>>b;
    OpOverload obj2(a,b);
    cout<<"Enter the real and imaginary values of number3 : ";
    cin>>a>>b;
    OpOverload obj3(a,b);
    OpOverload obj4=obj1+obj2+obj3;
    cout<<obj4.real<<" + i"<<obj4.imag<<endl;
}