#include <string>
#include <iostream>
#include "Garantie.h"

using namespace std;

class Produs{
   int pret; //ex: 45
   string marca; //”LG”
   int nr_proprietati; //  ex: nr_proprietati = 3
   string *proprietati;//ex: proprietati – vector cu 3 stringuri: “rosu”, “ignifug”, “patrat”
   Garantie g;

   public:
       Produs();
       Produs(int,string,int,string*,Garantie);
       Produs(const Produs&);
       Produs& operator =(const Produs&);
       ~Produs();
       void copiere(int,string,int,string*,Garantie);
       friend ostream& operator<<(ostream&,Produs&);
       friend void Sortare(int,Produs*&);
       friend void garantat(int,Produs*&);
       friend void servic(int,Produs*&);



};
