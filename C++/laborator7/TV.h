#include "Electrocasnic.h"


class TV: public Electrocasnic{
    double diagonal;
    string *proprietati;
    int nr_proprietati;
public:
    TV();
    TV(string,int,char*,double,string*,int);
    TV(const TV&);
    TV& operator=(const TV&);
    friend ostream& operator<<(ostream&, const TV&);
    friend istream& operator>>(istream&, TV&);
    friend void sortare(TV*&,int);
    friend void afisarepret(TV*,int);
    friend void basicafis(TV&);
};
