#include<iostream>
using namespace std;
void evenodd(int a)
{
    if(a==0)
    {
        cout<<a<<" is neither odd nor even"<<endl;
    }
    else{
        if(a%2==0)
        {
            cout<<a<<" is even"<<endl;
        }
        else{
            cout<<a<<" is odd"<<endl;
        }
    }
}
int main()
{
    int n;
    cout<<"Enter an integer : ";
    cin>>n;
    evenodd(n);
}
