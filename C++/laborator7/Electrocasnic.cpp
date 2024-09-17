#include <iostream>
#include "Electrocasnic.h"
#include <string.h>

using namespace std;

Electrocasnic::Electrocasnic():Produs()
{
    marca=nullptr;
}

Electrocasnic::Electrocasnic(string x,int n,char *a):Produs(x,n)
{
    if(marca !=nullptr)
        delete[] marca;
    marca=new char[strlen(a)+1];
    strcpy(marca,a);
}

Electrocasnic::~Electrocasnic()
{
    if(marca !=nullptr)
        delete[]marca;
}

Electrocasnic& Electrocasnic::operator=(const Electrocasnic& x)
{
        cod=x.cod;
    pret=x.pret;
    if(marca !=nullptr)
    delete[] marca;
    marca=new char(strlen(x.marca)+1);
    strcpy(marca,x.marca);
    return *this;
}

ostream& operator<<(ostream& dev, const Electrocasnic& x)
{
    dev<<"Cod: "<<x.cod<<" | Pret: "<<x.pret<<" | Marca: ";
    for(int i=0;i<strlen(x.marca);i++)
        dev<<x.marca[i];
    dev<<endl;
    return dev;
}

