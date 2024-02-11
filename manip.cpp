#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    cout<<"Usage of endl\n";
    cout<<"Enter a string : "<<endl;
    string s;
    getline(cin,s);
    cout<<"Entered string is "<<s<<endl;

    cout<<"Usage of ends\n";
    cout<<"Ram"<<ends;
    cout<<"jagan"<<endl;

    cout<<"Usage of ws\n";
    cout<<"Enter a string : "<<ends;
    getline(cin>>ws,s);
    cout<<"The white space removed string is : "<<s<<endl;

    cout<<"Usage of flush\n";
    cout<<”The line without flush\n";
    cout<<"The line with flush"<<flush<<endl;

    cout<<"Usage of setw\n";
    cout<<setw(7)<<"Ram"<<setw(7)<<"jagan"<<endl;
    cout<<setw(10)<<"Hello"<<setw(10)<<"World"<<endl;

    cout<<"Usage of setfill\n";
    cout<<setw(10)<<setfill('*')<<"Ram"<<setw(10)<<setfill('*')<<"jagan"<<endl;
    cout<<setw(8)<<setfill('^')<<"Hello"<<setw(8)<<setfill('^')<<"World"<<endl;

    cout<<"Usage of precision\n";
    float a=10.435678;
    cout<<"Precison upto 4 : "<<setprecision(4)<<a<<endl;
}
