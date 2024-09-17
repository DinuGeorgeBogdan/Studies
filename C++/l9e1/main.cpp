#include <iostream>
#include <cmath>

using namespace std;
struct complex{
        int a,b;
    };
void adunare(struct complex x,struct complex y)
{ int aad,bad;
    aad=x.a+y.a;
    bad=x.b+y.b;
    if(bad>=0)
        cout<<"Suma numerelor este: "<<aad<<"+"<<bad<<"i"<<endl;
    else cout<<"Suma numerelor este: "<<aad<<bad<<"i"<<endl;
}
void scadere(struct complex x,struct complex y)
{
    int asc,bsc;
    asc=x.a-y.a;
    bsc=x.b-y.b;
    if(bsc>=0)
        cout<<"Diferenta numerelor este: "<<asc<<"+"<<bsc<<"i"<<endl;
    else cout<<"Diferenta numerelor este: "<<asc<<bsc<<"i"<<endl;
}
void inmultire(struct complex x,struct complex y)
{  int ax,bx; //(a+bi)*(c+di)=ac+adi+bci-bd
    ax=x.a*y.a-x.b*y.b;
    bx=x.a*y.b+x.b*y.a;
    if(bx>=0)
        cout<<"Produsul numerelor este: "<<ax<<"+"<<bx<<"i"<<endl;
    else cout<<"Produsul numerelor este: "<<ax<<bx<<"i"<<endl;

}
void modul(struct complex x)
{   float mod;
    mod=sqrt(x.a*x.a+x.b*x.b);
    cout<<mod<<endl;

}
void citire(struct complex &x)
{
    cin>>x.a>>x.b;
    if(x.b>=0)
    cout<<"Numarul complex este: "<<x.a<<"+"<<x.b<<"i"<<endl;
    else cout<<"Numarul complex este: "<<x.a<<x.b<<"i"<<endl;
}

int main()
{   complex x,y;
    citire(x);
    citire(y);
    adunare(x,y);
    scadere(x,y);
    inmultire(x,y);
    cout<<"Modulul numarului x: ";
    modul(x);
    cout<<"Modulul numarului y: ";
    modul(y);

    return 0;
}
