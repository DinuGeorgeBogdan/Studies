#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int linii(ifstream& inf)
{
    int n=0;
    string v[50];
    if(inf)
    while (inf.eof()!=1)
    {   inf>>v[n];
        n++;
    }
inf.seekg(0);
return n;

}

void citire(ifstream& inf,string v[50],int& k)
{   int i=0;
    if(!inf)
    v[0]="NU EXISTA";
    else while (inf.eof()!=1)
    {
        inf>>v[i];
        i++;
        k++;
    }
inf.seekg(0);
}

void separare(ofstream& bf,ofstream&mf,string v[50],int k)
{
    for(int i=0;i<k;i++)
    {
        if(v[i][0]%2!=0)
            bf<<v[i]<<endl;
            else mf<<v[i]<<endl;
    }
}

void nastere(ofstream& nf,string DATE[50],int k)
{   string aux;
    for(int i=0;i<k-1;i++)
        for(int j=i+1;j<k;j++)
            if(DATE[i]>DATE[j])
                {
                    aux=DATE[i];
                    DATE[i]=DATE[j];
                    DATE[j]=aux;
                }

    for(int i=0;i<k;i++)
    {


                nf<<DATE[i];
            nf<<endl;
        }

}

void XY(ofstream& nf,string DATE[50],int k)
{   nf<<endl;
    string bin("010");
    int locat[100];
    for(int i=0;i<k;i++)
    {locat[i]=DATE[i].find(bin);
    if(locat[i]!=-1)
    DATE[i].replace(locat[i],bin.size(),"XY");
    nf<<DATE[i]<<endl;
    }

}

int main()
{
    string v[50];
ifstream inf("date.in");
ofstream bf("barbati.out");
ofstream mf("femei.out");
ofstream nf("date_nastere.out");
    int k=0;
    cout<<"Numar de linii: "<<linii(inf)<<endl<<endl;
    citire(inf,v,k);
    cout<<"Lista de CNP-uri:"<<endl;
    for(int i=0;i<10;i++)
        cout<<v[i]<<endl;;
    separare(bf,mf,v,k);
    string DATE[50];
    for(int i=0;i<k;i++)
        DATE[i]=v[i].substr(1,6);
            nastere(nf,DATE,k);
    XY(nf,DATE,k);


    return 0;
}
