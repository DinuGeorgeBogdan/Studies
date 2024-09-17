#include <string>
#include <iostream>
using namespace std;

class Garantie{
  int nr_luni;  //durata garantie
  string service; //cine asigura service-ul

  public:
    Garantie();
    Garantie(const Garantie&);
    Garantie(int,string);
    Garantie& operator =(const Garantie&);
    ~Garantie();
     friend ostream& operator<<(ostream&, Garantie &);
    bool vernr();
    bool verserv();

};

