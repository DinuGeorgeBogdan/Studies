#include "TV.h"

#include <string.h>
#include <iostream>

TV::TV():Electrocasnic()
{
    diagonal=0;
    proprietati=nullptr;
    nr_proprietati=0;
}

TV::TV(string x,int n,char *a,double dia,string *prop,int nr_prop):Electrocasnic(x,n,a)
{

    diagonal=dia;
    nr_proprietati=nr_prop;
    proprietati=new string[nr_prop];
    for(int i=0;i<nr_prop;i++)
        proprietati[i]=prop[i];
}


TV::TV(const TV& x)
{
    cod=x.cod;
    pret=x.pret;
    if(marca !=nullptr)
        delete[] marca;
    marca=new char[strlen(x.marca)+1];
    strcpy(marca,x.marca);
    diagonal=x.diagonal;
    nr_proprietati=x.nr_proprietati;
    if(proprietati!=nullptr)
        delete[] proprietati;
    proprietati=new string[x.nr_proprietati];
    for(int i=0;i<x.nr_proprietati;i++)
        proprietati[i]=x.proprietati[i];
}

TV& TV::operator=(const TV& x)
{
    cod=x.cod;
    pret=x.pret;
    if(marca !=nullptr)
        delete[] marca;
    marca=new char[strlen(x.marca)+1];
    strcpy(marca,x.marca);
    diagonal=x.diagonal;
    nr_proprietati=x.nr_proprietati;
    if(proprietati!=nullptr)
        delete[] proprietati;
    proprietati=new string[x.nr_proprietati];
    for(int i=0;i<x.nr_proprietati;i++)
        proprietati[i]=x.proprietati[i];
        return *this;
}

ostream& operator<<(ostream& dev, const TV& x)
{
    dev<<"Cod: "<<x.cod<<" | Pret: "<<x.pret<<" | Marca: ";
    for(int i=0;i<strlen(x.marca);i++)
        dev<<x.marca[i];
    dev<<" | Diagonala: "<<x.diagonal<<" | Numar proprietati: "<<x.nr_proprietati<<" | Proprietati: ";
    for(int i=0;i<x.nr_proprietati;i++)
        dev<<x.proprietati[i]<<" ";
    dev<<endl;
    /*
    cout<<"Cod: ";
    dev<<x.cod;
    cout<<"Pret: ";
    dev<<x.pret;
    cout<<"Marca: ";
    for(int i=0;i<strlen(x.marca);i++)
        dev<<x.marca[i];
    cout<<"Diagonala: ";
    dev<<x.diagonal;
    cout<<"Numar Proprietati: ";
    dev<<x.nr_proprietati;
    cout<<"Proprietati:";
    for(int i=0;i<x.nr_proprietati;i++)
        dev<<x.proprietati[i];*/

    return dev;
}



istream& operator>>(istream& dev,TV& x)
{
    cout<<"Cod: ";
    dev>>x.cod;
    cout<<"Pret: ";
    dev>>x.pret;
    cout<<"Marca: ";
    char aux[100];
    dev>>aux;
    x.marca=new char[strlen(aux)+1];
    strcpy(x.marca,aux);
    cout<<"Diagonala: ";
    dev>>x.diagonal;
    cout<<"Numar Proprietati: ";
    dev>>x.nr_proprietati;
    cout<<"Proprietati:";
    x.proprietati=new string[x.nr_proprietati];
    for(int i=0;i<x.nr_proprietati;i++)
        dev>>x.proprietati[i];
    if(x.nr_proprietati==0)
        cout<<endl;
    return dev;
}


void sortare(TV* &x,int n)
{   TV aux;
    for(int i=0;i<n-1;i++)
        for(int j=i+1;j<n;j++)
            if(x[i].diagonal>x[j].diagonal)
                {aux=x[i];
                x[i]=x[j];
                x[j]=aux;
                }
}

void afisarepret(TV* x,int n)
{
    for(int i=0;i<n-1;i++)
        if(x[i].pret>10.0&&strcmp(x[i].marca,"LG")==0)
            cout<<x[i];
}
