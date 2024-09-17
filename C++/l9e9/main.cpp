#include <iostream>

using namespace std;
struct timp{
int o,m,s;//ora minut secunda
};

void citire(struct timp &x)//citire prin referinta. De ce? Pentru ca daca nu atunci memoreaza numere aleatorii si diferenta dintre ora 2 22 33 si ora 3 4 11 devine 764525:62535:2532523
{
    cin>>x.o>>x.m>>x.s;
    cout<<x.o<<":"<<x.m<<":"<<x.s<<endl;
}

void delta(struct timp x, struct timp y)
{
    int o,m,s,reper1=0,reper2=0; //luam exemplu ora 1 20min 33s si ora 3 11min 35s avem 35-33=2s 11-20=-9=51min 3-1=2-1 pt ca min2<min1=1

    if(x.s<=y.s)
        s=y.s-x.s;
    else {s=60+y.s-x.s;
            reper1++;}

    if(x.m<=y.m)
        m=y.m-x.m-reper1;
    else {m=60+y.m-x.m-reper1;
            reper2++;}

        o=y.o-x.o-reper2;


    cout<<"Timp scurs: "<<o<<":"<<m<<":"<<s<<endl;

}

int main()
{   timp x,y;
    citire(x);
    citire(y);

    delta(x,y);
    return 0;
}
