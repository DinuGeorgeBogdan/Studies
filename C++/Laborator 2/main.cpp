#include "Angajat.h"
#include <iostream>
#include <string.h>

using namespace std;

int main()
{
Angajat p, p1("aa","11",4000);
Angajat p2(p1);
p2.afisare();
p.modificare(p2);
p2.afisare();
cout<<"Este persoana aceasta femeie?"<<endl;
if(p2.eFemeie())
    cout<<"Da."<<endl;
else cout<<"Nu."<<endl;


int n;
cout<< "Numar angajati:";
cin>>n;
Angajat* v=new Angajat[n];
for(int i=0;i<n;i++)
    v[i].init();
cout<<"Lista:"<<endl;
for(int i=0;i<n;i++)
    v[i].afisare();
for(int i=0;i<n;i++)
    if(v[i].eFemeie())
    cout<<"Da."<<endl;
else cout<<"Nu."<<endl;



	return 0;
}
