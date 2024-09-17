#include <iostream>
#include "fractie.h"
using namespace std;

int main()
{   fractie v[20],x[20];
int k=-1;
    for(int i=0;i<20;i++)
        v[i].setData(i+1,i+2);
    for(int i=0;i<20;i++)
        v[i].afisare();
    cout<<endl;
    for(int i=0;i<20;i++)
    {
        if((i+1)%10==0)
            {k++;
            x[k]=v[i]+v[i-1];
            cout<<"suma"<<endl;
            }
            else if((i+1)%5==0)
            {
                k++;
                x[k]=v[i]-v[i-1];
                cout<<"scadere"<<endl;
            }
            else if((i+1)%4==0)
            {
                k++;
                x[k]=v[i]*v[i-1];
                cout<<"inmultire"<<endl;
            }
            else if((i+1)%3==0)
            {
                k++;
                x[k]=v[i]/v[i-1];
                cout<<"impartire"<<endl;
            }
            else if((i+1)%2==0)
            {
                k++;
                x[k]+=v[i];
                cout<<"Suma cu +="<<endl;
            }
    }
    cout<<endl<<endl;
for(int i=0;i<=k;i++)
{
    x[i].afisare();
}
v[0]-=v[1];
v[1]*=v[2];
v[2]/=v[3];
v[3]=-v[3];
cout<<endl;
v[0].afisare();
cout<<" ";
v[1].afisare();
cout<<" ";
v[2].afisare();
cout<<" ";
v[3].afisare();
cout<<endl;

fractie r(3,5),t(v[3]);
int f;

if(r==t)
    cout<<"Egale";
else if(r>t)
    cout<<"R este mai mare ca V";
else cout<<"V este mai mare ca V";
cout<<endl;
r.afisare();
cout<<" si inversul: ";
r=r.getInv();
r.afisare();
cout<<endl<<xr.getValoare()<<endl;
    return 0;

}
