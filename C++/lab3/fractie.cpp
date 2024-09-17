#include <iostream>
#include "fractie.h"
using namespace std;

fractie::fractie(int v,int w)
{
    a=v;
    b=w;
}

fractie::fractie(const fractie &x)
{
    a=x.a;
    b=x.b;
}

fractie& fractie::operator=(const fractie &x)
{
    a=x.a;
    b=x.b;
    return *this;
}

fractie::~fractie()
{

}

void fractie::setData(int x,int y)
{
    a=x;
    b=y;
}

void fractie::afisare() const
{
    cout<<a<<"/"<<b<<" ";
}

double fractie::getValoare() const
{
    return a*1.0/b;
}

fractie fractie::getInv()
{
    fractie x;
    x.a=b;
    x.b=a;
    return x;

}

float fractie::getA()
{
    return a*1.0;
}

float fractie::getB()
{
    return b*1.0;
}
//double operations
const fractie operator +(const fractie &x,const fractie &y)
{   fractie s;
    if(x.b==y.b)
        s.a=x.a+y.a;
    else {s.b=x.b*y.b;
          s.a=x.a*y.b+y.a*x.b;}
    return s;

}

const fractie operator -(const fractie &x,const fractie &y)
{   fractie s;
    if(x.b==y.b)
        s.a=x.a-y.a;
    else {s.b=x.b*y.b;
          s.a=x.a*y.b-y.a*x.b;}
    return s;

}

const fractie operator -(const fractie &x)
{
    fractie s;
    s.a=-x.a;
    s.b=x.b;
    return s;
}

const fractie operator *( const fractie& x, const fractie& y)
{
    fractie s;
    s.a=x.a*y.a;
    s.b=x.b*y.a;
    return s;
}

const fractie operator /( const fractie& x, const fractie& y)
{
    fractie s;
    s.a=x.a*y.b;
    s.b=y.b*y.a;
    return s;
}

//single operations

fractie& fractie::operator +=(const fractie& y)
{
fractie s;
    if(b==y.b)
        s.a=a+y.a;
    else {s.b=b*y.b;
          s.a=a*y.b+y.a*b;}
 a=s.a;
 b=s.b;

}

fractie& fractie::operator -=(const fractie& y)
{
    fractie s;
    if(b==y.b)
        s.a=a-y.a;
    else {s.b=b*y.b;
          s.a=a*y.b-y.a*b;}
    a=s.a;
    b=s.b;
}
fractie& fractie::operator *=(const fractie& y)
{
    fractie s;
    s.a=a*y.a;
    s.b=b*y.a;
    a=s.a;
    b=s.b;
}
fractie& fractie::operator /=(const fractie& y)
{
    fractie s;
    s.a=a*y.a;
    s.b=b*y.a;
    a=s.a;
    b=s.b;
}

//Bool

bool operator ==(const fractie &x, const fractie &y)
{
    if(x.a*y.b==y.a*x.b)
        return 1;
    else return 0;
}
bool operator !=(const fractie &x, const fractie &y)
{
    if(x.a*y.b==y.a*x.b)
        return 0;
    else return 1;
}
bool operator >(const fractie &x, const fractie &y)
{
    if(x.a*y.b>y.a*x.b)
        return 1;
    else return 0;
}
bool operator <(const fractie &x, const fractie &y)
{
    if(x.a*y.b<y.a*x.b)
        return 1;
    else return 0;
}
bool operator >=(const fractie &x, const fractie &y)
{
    if(x.a*y.b>=y.a*x.b)
        return 1;
    else return 0;
}
bool operator <=(const fractie &x, const fractie &y)
{
    if(x.a*y.b<=y.a*x.b)
        return 1;
    else return 0;
}
