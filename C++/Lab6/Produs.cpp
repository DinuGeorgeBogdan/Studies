#include <iostream>
#include "Produs.h"
#include <string>

using namespace std;

Produs::Produs()
{
    pret=0;
    marca=nullptr;
    nr_proprietati=0;
    proprietati[0]=nullptr;
    Garantie g;
}

Produs::Produs(int a,string x,int b,string* y,Garantie z)
{
    pret=a;
    marca=x;
    nr_proprietati=b;
    proprietati=new string[b];
    for(int i=0;i<b;i++)
        proprietati[i]=y[i];
    g=z;
}

Produs::Produs(const Produs& x)
{
    pret=x.pret;
    marca=x.marca;
    nr_proprietati=x.nr_proprietati;
    for(int i=0;i<x.nr_proprietati;i++)
        proprietati[i]=x.proprietati[i];
    g=x.g;
}

Produs::~Produs()
{
    proprietati=nullptr;
}

ostream& operator<<(ostream& dev,Produs& x)
{
    dev<<"Pret: "<<x.pret<<" | Marca: "<<x.marca<<" | Proprietati: ";
    for(int i=0;i<x.nr_proprietati;i++)
        dev<<x.proprietati[i]<<" ";
    dev<<x.g;
    dev<<endl;
    return dev;
}

Produs& Produs::operator =(const Produs&x)
{
    pret=x.pret;
    marca=x.marca;
    nr_proprietati=x.nr_proprietati;
    for(int i=0;i<x.nr_proprietati;i++)
        proprietati[i]=x.proprietati[i];
    g=x.g;
}


void Sortare(int n,Produs* &x)
{   int aux;
    for(int i=0;i<n-1;i++)
        for(int j=i+1;j<n;j++)
            if(x[i].pret>x[j].pret)
            {
                aux=x[i].pret;
                x[i].pret=x[j].pret;
                x[j].pret=aux;
            }
}

void garantat(int n,Produs* &x)
{
    for(int i=0;i<n-1;i++)
            if(x[i].g.vernr())
                cout<<x[i]<<endl;
}

void servic(int n,Produs* &x)
{
    for(int i=0;i<n-1;i++)
        if(x[i].g.verserv())
            cout<<x[i]<<endl;
}
