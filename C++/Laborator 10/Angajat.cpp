#include "Angajat.h"


Angajat::Angajat(const Angajat &x)
{
    id_angajat=x.id_angajat;
    firma=x.firma;
    salariu=x.salariu;
}

Angajat& Angajat::operator=(const Angajat &x)
{
    id_angajat=x.id_angajat;
    firma=x.firma;
    salariu=x.salariu;
    return *this;
}

void Angajat::afisare()
{
    cout<<id_angajat<<" "<<firma<<" "<<salariu<<" "<<endl;
}
