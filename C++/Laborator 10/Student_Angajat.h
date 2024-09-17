#include "Angajat.h"
#include "Student.h"
using namespace std;

class Student_Angajat:public Student, public Angajat{

public:
    Student_Angajat();
    Student_Angajat(int,string,int,int,string,int,int*);
    Student_Angajat(const Student_Angajat&);
    ~Student_Angajat();
    Student_Angajat& operator=(const Student_Angajat&);
    void afisare();
}; //venitul unui student angajat pe luna e salariul + bursa (=500) sau 0 daca nu are bursa


