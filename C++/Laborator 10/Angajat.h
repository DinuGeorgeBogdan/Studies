#include "Persoana.h"
using namespace std;

class Angajat : virtual public Persoana{
int id_angajat; //unic pentru fiecare persoana de acest tip
string firma; //firma unde lucreaza
int salariu;

public:
    Angajat();
    Angajat(int,string,int);
    Angajat(const Angajat&);
    Angajat& operator=(const Angajat&);
    void afisare();
}; // venitul unui angajat pe luna e salariul

