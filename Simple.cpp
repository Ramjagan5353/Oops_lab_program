#include<iostream>
#include<string>
using namespace std;
class animal{
    public:
    void display()
    {
        cout<<"I was an animal"<<endl;
    }
};
class cat : public animal{
    public:
    void type(){
        cout<<"I was a cat!!Meow"<<endl;
    }
    //void display(){
      // cout<<"I was an animal and cat"<<endl;
   //}

};
int main()
{

    cat C1;
    C1.display();
    C1.type();
}
