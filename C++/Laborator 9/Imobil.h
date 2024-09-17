#include "Proprietate.h"

class Imobil : public Proprietate{
double venit_pe_an;
char *info_tip_intretinere;
public:
    Imobil();
    Imobil(char*,double);
    Imobil(const Proprietate&);
    Imobil& operator=(const Proprietate&);
};
