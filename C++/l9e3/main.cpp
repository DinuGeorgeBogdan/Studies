#include <iostream>
#include <cmath>
#include <stdlib.h>
using namespace std;

struct axe{
    int x,y;
    };
void citire(struct axe &a)
{
    cin>>a.x>>a.y;

}
void afisare(struct axe a)
{
    cout<<"Punctul: ("<<a.x<<";"<<a.y<<")"<<endl;
}
void distanta(struct axe a,struct axe b)
{
    float dist;
    dist=sqrt((b.x-a.x)*(b.x-a.x)+(b.y-a.y)*(b.y-a.y));
    cout<<"Distanta este de: "<<dist<<" unitati."<<endl;
}
int main()
{   axe a,b;
cout<<"Citire a:"<<endl;
citire(a);
afisare(a);
cout<<"Citire b:"<<endl;
citire(b);
afisare(b);
distanta(a,b);

int n;
axe* v;
cout<<"Valoare n: ";
cin>>n;
v=(axe*)malloc(n*sizeof(axe));
cout<<"Dati valori punctelor vectorului:"<<endl;
for(int i=0;i<n;i++)
    citire(v[i]);
cout<<"Distanta dintre fiecare 2 puncte consecutive:"<<endl;
for(int i=0;i<n;i++)
    distanta(v[i],v[i+1]);
cout<<endl;
cout<<"Afisarea vectorului:"<<endl;
for(int i=0;i<n;i++)
    afisare(v[i]);

    return 0;
}
