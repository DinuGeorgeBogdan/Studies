#include "Student.h"

Student::Student()
{
    id_student=0;
    facultate="";
    n=0;
    note=0;
}
Student::Student(int a,string b,int c,int* d)
{
    id_student=a;
    facultate=b;
    n=c;
    note=new int[n];
    for(int i=0;i<n;i++)
        note[i]=d[i];
}
Student::Student(const Student &a)
{
    id_student=a.id_student;
    facultate=a.facultate;
    n=a.n;
    note=new int[n];
    for(int i=0;i<n;i++)
        note[i]=a.note[i];
}
Student::~Student()
{
    delete[] note;
}

Student& Student::operator=(const Student &a)
{
    id_student=a.id_student;
    facultate=a.facultate;
    n=a.n;
    note=new int[n];
    for(int i=0;i<n;i++)
        note[i]=a.note[i];
    return *this;
}

void Student::afisare()
{
    cout<<id_student<<" "<<facultate<<" "<<n<<" ";
    for(int i=0;i<n;i++)
        cout<<note[i]<<" ";
    cout<<endl;
}
