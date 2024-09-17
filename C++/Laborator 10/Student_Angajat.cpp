#include "Student_Angajat.h"

Student_Angajat::Student_Angajat():Student(),Angajat()
{

}

Student_Angajat::Student_Angajat(int a,string b,int c,int d,string e,int f,int* h):Angajat(a,b,c),Student(d,e,f,h)
{

}

Student_Angajat::Student_Angajat(const Student_Angajat&a):Angajat(&a),Student(&a)
{

}

Student_Angajat::~Student_Angajat():~Angajat(),~Student()
{

}

Student_Angajat& Student_Angajat::operator=(const Student_Angajat&a):Angajat::operator=(a),Student::operator=(a)
{

}

void Student_Angajat::afisare():Angajat::afisare(),Student::afisare()
{
    cout<<endl;
}

