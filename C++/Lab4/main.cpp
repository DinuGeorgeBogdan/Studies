#include <iostream>
#include "MyString.h"

using namespace std;

int main()
{
    MyString x;
    MyString y("String");
    MyString z(y);
    cin>>x;
    cout<<x<<" "<<y<<" "<<z<<endl;
    if(x!=y)
        cout<<"Primii 2 vectori sunt diferiti."<<endl;
    else cout<<"Primii 2 vectori sunt identici."<<endl;
    if(y==z)
        cout<< "Declararea cu MyString ca parametru functioneaza."<<endl;
    MyString c;
    c=x+y;
    c+=y;
    cout<<c<<endl;
    cout<<c.lookFor(y[1])<<endl;
    return 0;
}
