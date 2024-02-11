#include<iostream>
using namespace std;
int main()
{
    float a,b;
    int choice;
    cout<<"Enter number1 : ";
    cin>>a;
    cout<<"Enter number2 : ";
    cin>>b;
    cout<<"1.Addition   2.Subtraction   3.Multiplication    4.Division"<<endl;
    cout<<"Enter your choice(1-4): ";
    cin>>choice;
    switch(choice)
    {
        case 1:
            cout<<a<<" + "<<b<<" = "<<a+b<<endl;
            break;
        case 2:
            cout<<a<<" - "<<b<<" = "<<a-b<<endl;
            break;
        case 3:
            cout<<a<<" * "<<b<<" = "<<a*b<<endl;
            break;
        case 4:
            cout<<a<<" / "<<b<<" = "<<a/b<<endl;
            break;
        default:
            cout<<"Invalid choice,try again"<<endl;
            break;
    }
}
