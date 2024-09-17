#include <iostream>
#include "Garantie.h"
#include <string>
using namespace std;

Garantie::Garantie()
{
    nr_luni=0;
    service=nullptr;
}

Garantie::Garantie(int x, string y)
{
    nr_luni=x;
    service=y;
}

Garantie::Garantie(const Garantie& x)
{
    nr_luni=x.nr_luni;
    service=x.service;
}

Garantie::~Garantie()
{
}

Garantie& Garantie::operator=(const Garantie& x)
{
    nr_luni=x.nr_luni;
    service=x.service;
}

ostream& operator<<(ostream& dev, Garantie& x)
{
    dev<<"Numar luni: "<<x.nr_luni<<" | Serviciu: "<<x.service;
    return dev;
}

bool Garantie::vernr()
{
    if(nr_luni>12)
        return 1;
    else return 0;
}

bool Garantie::verserv()
{
    if(service=="SerVice")
        return true;
    else return false;
}
