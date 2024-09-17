#include <string>
using namespace std;

class Produs{
protected:
   string cod;
   int pret;

public:
    Produs();
    Produs(string,int);
    Produs(const Produs&);
    friend ostream& operator<<(ostream&, const Produs&);
};
