#include<iostream>
using namespace std;
class Box{
    private:
        float Bl,Bw,Bh;
    public:
        void boxArea(float l,float w,float h)
        {
            Bl=l;
            Bw=w;
            Bh=h;
            cout<<"Area of the box is "<<2*(Bl*Bw+Bw*Bh+Bl*Bh)<<endl;
        }
        void boxVolume(float l,float w,float h);
        friend void displayBoxDimensions(Box obj);
        inline  void displayWelcomeMessage()
        {
            cout<<"Hello,welcome to oop!!"<<endl;
        }
};
void Box :: boxVolume(float l,float w,float h)
{
    Bl=l;
    Bw=w;
    Bh=h;
    cout<<"Volume of the box is "<<Bl*Bw*Bh<<endl;
}
void displayBoxDimensions(Box obj)
{
    cout<<"Length : "<<obj.Bl<<endl;
    cout<<"Width : "<<obj.Bw<<endl;
    cout<<"Height : "<<obj.Bh<<endl;
}
int main()
{
    Box obj;
    float l,w,h;
    obj.displayWelcomeMessage();
    cout<<"Enter length,width,height of the box : "<<endl;
    cin>>l>>w>>h;
    obj.boxArea(l,w,h);
    obj.boxVolume(l,w,h);
    displayBoxDimensions(obj);
}
