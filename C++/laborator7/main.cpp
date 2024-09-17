#include "TV.h"
#include <iostream>
#include <string>
using namespace std;

int main()
{
    TV*t;
    int n;
    cout<<"Numar obiecte: ";
    cin>>n;
    t=new TV[n];
    for(int i=0;i<n;i++)
    {
        cin>>t[i];
    }

    sortare(t,n);
    for(int i=0;i<n;i++)
    {
        cout<<t[i];
    }

    cout<<endl<<endl<<endl;

    afisarepret(t,n);

    return 0;
}
