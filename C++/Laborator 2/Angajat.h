
//fisier Angajat.h
class Angajat{
char*nume; //se stocheza numele si prenumele fara spatiu: Popescu_Ion
char CNP[14];
int salariu;
public:
Angajat(); //Constructor
Angajat(char*,char[], int);//constr. cu param; pentru a initializa cu valori toate atributele;
Angajat(const Angajat&); //constructor de copiere – se apeleaza automat la transmiterea
//parametrilor in fctii prin valoare; returnarea obj din fctii prin valoare;
              // puneti  cout<<”const de copiere”; in impl. ca sa vedeti unde e apelat;
~ Angajat(); //Destructor
void afisare() const; //afiseaza toate atributele unui angajat
void modificare(const Angajat&); // face o copie profunda a parametrului si o stocheaza in
//objectul cu care se face apelul;
int getCash() const;//getter pentru salariu
bool eFemeie() const;
void init();
char* getName(); //getter pentru nume
}; //si orice alta metoda considerati ca mai este necesara

//Angajat.cpp
//aici o sa faceti implementarea metodelor
//includeti “Angajat.h”
