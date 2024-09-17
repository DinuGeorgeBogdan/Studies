#include "Persoana.h"

using namespace std;

class Student : virtual public Persoana{
    int id_student; //unic pentru fiecare persoana de acest tip
    string facultate; // facultatea unde invata
    int n; //nr. note pe baza carora se calculeaza media
    int *note; //vectorul in care se stocheaza cele n note
public:
    Student();
    Student(int,string,int,int*);
    Student(const Student&);
    ~Student();
    Student& operator=(const Student&);
    void afisare();
}; //media studentului e suma notelor/n; daca media>8.5 si nu are note<5 atunci are bursa
// venitul unui student pe luna e bursa (=500) sau 0 daca nu are bursa
