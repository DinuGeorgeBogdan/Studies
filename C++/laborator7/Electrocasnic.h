#include "Produs.h"


class Electrocasnic : public Produs{
protected:
    char *marca;
public:
    Electrocasnic();
    Electrocasnic(string,int,char*);
    Electrocasnic(const Electrocasnic&);
    ~Electrocasnic();
    Electrocasnic& operator=(const Electrocasnic&);
    friend ostream& operator<<(ostream&, const Electrocasnic&);

};
