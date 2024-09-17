#include <iostream>
#include "MyString.h"
#include <string.h>
using namespace std;

MyString::MyString()
{
    buf=nullptr;
    l=0;
}
MyString::MyString(char *x)
{   l=strlen(x);
    buf=new char[l+1];
    strcpy(buf,x);
}

MyString::MyString(const MyString &x)
{    l=x.l;
        buf=new char[l+1];
    strcpy(buf,x.buf);

}

MyString& MyString::operator=(const MyString &x)
{
    if(buf!=nullptr)
        delete[] buf;
    l=x.l;
    buf=new char[l+1];
    strcpy(buf,x.buf);

}

MyString::~MyString()
{
      if (buf != nullptr)
        delete[] buf;
}

ostream& operator<<(ostream& dev, const MyString& v)
{
dev << "Nr Elem:" << v.l << endl;
dev << "Vector: ";
if (v.buf!=NULL)
for(int i = 0; i < v.l; i++)
dev << v.buf[i]<< " " ;
dev << endl;
return dev;
}


istream & operator >>(istream &dev, MyString &v)
{
cout << "Dati nr. de elem.:" << endl;
dev>>v.l;
if (v.buf!=NULL)
    delete [] v.buf;
if (v.l>0){
v.buf=new char[v.l];
cout << "Dati valorile pentru elemente:" << endl;
for(int i = 0; i < v.l; i++)
dev >> v.buf[i];
} else v.buf=NULL;
return dev;
}


char& MyString::operator[](int n)
{
    return buf[n];
}

const MyString operator+(const MyString&x, const MyString&y)
{
    MyString a;
    a.l=x.l+y.l;
    a.buf=new char[a.l+1];
    strcat(a.buf,x.buf);
    strcat(a.buf,y.buf);
    return a;
}

MyString& MyString::operator+=(const MyString&x)
{
    l=l+x.l;
    strcat(buf,x.buf);
    return *this;
}

bool operator==(const MyString&x, const MyString&y)
{
    if(x.l==y.l&&strcmp(x.buf,y.buf)==0)
        return true;
    else return false;
}

bool operator!=(const MyString&x, const MyString&y)
{
    if(x.l!=y.l&&strcmp(x.buf,y.buf)!=0)
        return true;
    else return false;
}

int MyString::lookFor(char x)
{   int nr=0,i;
    for(i=0;i<=l;i++)
        if(buf[i]==x)
            nr++;
    return nr;
}
