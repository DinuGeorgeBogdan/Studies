#include "Proprietate.h"

Proprietate::Proprietate()
{
    tip=nullptr;
    valoare=0;
}

Proprietate::Proprietate(char *a,double nr)
{
    tip=new char[strlen(a)+1];
    strcpy(tip,a);
    valoare=nr;
}

Proprietate::Proprietate(const Proprietate &a)
{
    tip=new char[strlen(a.tip)+1];
    strcpy(tip,a.tip);
    valoare=a.valoare;
}

Proprietate& Proprietate::operator=(const Proprietate& a)
{
    tip=new char[strlen(a.tip)+1];
    strcpy(tip,a.tip);
    valoare=a.valoare;
    return *this;
}
