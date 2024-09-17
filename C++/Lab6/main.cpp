#include <iostream>
#include "Produs.h"
#include <string>

using namespace std;

int main()
{
    Garantie y(1,"Garantii Gratis");
    string z[2];
    z[0]="Berceni";
    z[1]="Lunca";

    Produs x(1,"LG",2,z,y);
    Produs a(x);
    Produs b(2,"Nvidia",2,z,y);
    int n;
    cout<<"Numar elemente: ";
    cin>>n;
    Produs* prodd;
    prodd=new Produs[n];
    for(int i=0;i<n;i++)
    {   int a1,c1,g1;
        string b1,d1,g2;
        Garantie aux(g1,g2);
        prodd[i](a1,b1,c1,d1,aux);
    }

    return 0;
}
