#include<iostream>
#include<string>
using namespace std;
class Base{
    private:
    int pri=1;
    protected:
    int pro=2;
    public:
    int pub=3;
    int getpri(){
        return pri;
    }
};
class publicderived : public Base{
    public:
    int getpro(){
        return pro;
    }
};
class privatederived : private Base{
    public:
    int getpub(){
        return pub;
    }
    int getpro(){
        return pro;
    }
    int privar=getpri();
};
class protectedderived : protected Base{
    public:
    int getpub()
    {
        return pub;
    }
    int getpro()
    {
        return pro;
    }
    int privar=getpri();
};
int main()
{
    publicderived obj1;
    cout<<"PUBLIC INHERITANCE"<<endl;
    cout<<"Public variable : "<<obj1.pub<<endl;
    cout<<"Protected variable : "<<obj1.getpro()<<endl;
    cout<<"Private variable : "<<obj1.getpri()<<endl;
    privatederived obj2;
    cout<<"PRIVATE INHERITANCE"<<endl;
    cout<<"Public variable : "<<obj2.getpub()<<endl;
    cout<<"Protected variable : "<<obj2.getpro()<<endl;
    cout<<"Private variable : "<<obj2.privar<<endl;
    protectedderived obj3;
    cout<<"PROTECTED INHERITANCE"<<endl;
    cout<<"Public variable : "<<obj3.getpub()<<endl;
    cout<<"Protected variable : "<<obj3.getpro()<<endl;
    cout<<"Private variable : "<<obj3.privar<<endl;
}
