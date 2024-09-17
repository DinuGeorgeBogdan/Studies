#include "Produs.h"
#include <iostream>

using namespace std;

Produs::Produs()
{
    cod="";
    pret=0;
}

Produs::Produs(string x,int n)
{
    cod=x;
    pret=n;
}

Produs::Produs(const Produs &x)
{
    cod=x.cod;
    pret=x.pret;
}

ostream& operator<<(ostream& dev, const Produs& x)
{
    dev<<"Cod: "<<x.cod<<" | Pret: "<<x.pret<<endl;
    return dev;
}
