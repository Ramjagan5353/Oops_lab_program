#include<iostream>
using namespace std;
class AccessSpecifierDemo{
   private:
       int priVar;
   protected:
       int proVar;
   public:
       int pubVar;
       void setVar(int priValue,int proValue,int pubValue)
       {
           priVar=priValue;
           proVar=proValue;
           pubVar=pubValue;
       }
       void getVar()
       {
           cout<<"Public variable : "<<pubVar<<endl;
           cout<<"Protected variable : "<<proVar<<endl;
           cout<<"Private variable : "<<priVar<<endl;
       }
};
int main()
{
   AccessSpecifierDemo obj;
   int priValue,proValue,pubValue;
   cout<<"Enter the values of private,protected,public variable : ";
   cin>>priValue>>proValue>>pubValue;
   obj.setVar(priValue,proValue,pubValue);
   cout<<"The member variables are"<<endl;
   obj.getVar();
}
