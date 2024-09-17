#include "Angajat.h"
#include <iostream>
#include <string.h>

using namespace std;

Angajat::Angajat() //Constructor de baza
{
    nume = nullptr;
    salariu = 0;
    strcpy(CNP, "0");
}

Angajat::Angajat(char *nume2, char CNP2[], int salariu2) //constructorul cu parametrii
{
    char aux[100];
    strcpy(aux, nume2);
     nume = new char[strlen(aux) + 1];
    strcpy(nume, aux);
    strcpy(CNP, CNP2);
    salariu = salariu2;
}

Angajat::Angajat(const struct Angajat &nr) //constructorul de copiere
{

    char aux[100];
    strcpy(aux, nr.nume);
    if (nume != nullptr)
        delete nume;
    nume = new char[strlen(aux) + 1]; //copiere. Alocam spatiu si pentru NULL.
    strcpy(nume, aux);
    strcpy(CNP, nr.CNP);
    salariu = nr.salariu;
    cout << "Constructor de Copiere.";
}

Angajat::~Angajat() //destructorul
{
    if (nume != nullptr)
        delete[] nume;
}

void Angajat::init() //metoda de initializare a obiectului
{
    char nume_aux[100];
    cout << "Introduceti numele: " << endl;
    cin >> nume_aux;
    nume = new char[strlen(nume_aux) + 1];
    strcpy(nume, nume_aux);
    cout << "Introduceti CNP-ul: " << endl;
    cin >> CNP;
    cout << "Introduceti salariul: " << endl;
    cin >> salariu;
    cout<<endl;
}

void Angajat::afisare() const //metoda de afisare a unui obiect
{
    cout << "Nume: " << nume << endl;
    cout << "CNP: " << CNP << endl;
    cout << "Salariu: " << salariu << endl<<endl;
}

void Angajat::modificare(const struct Angajat &k) //modificare obiectului cu alt obiect ca parametru
{
    char aux[100];
    strcpy(aux, k.nume);
    if (nume != NULL)
        delete nume;
    nume = new char[strlen(aux) + 1]; //copiere in pointer cu auxiliar
    strcpy(CNP, k.CNP);
    strcpy(nume, aux);
    salariu = k.salariu;
}

int Angajat::getCash() const //getter salariu
{
    return salariu;
}

bool Angajat::eFemeie() const //Verificarea sexului angajatului (nr pare = femeie , nr impare = barbat)
{
    if (strchr("02468",CNP[0]))
        return true;
    else
        return false;
}
char *Angajat::getName() //metoda de returnare a numelui, folosita la soratare
{
    return nume;
}
