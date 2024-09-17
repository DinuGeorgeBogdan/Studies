#include<iostream>

#include<vector>

#include<fstream>

#include <string.h>

using namespace std;

class Produs {
    public:
        virtual int getpret() = 0;
    virtual void afisare() = 0;
};

class Produs_Software: public Produs {
    protected: int pret;
    public: Produs_Software() {
        pret = 0;
    }
    Produs_Software(int preta) {
        pret = preta;
    }
    void SetProdus() {
        cout << "Pret Produs Software: ";
        cin >> pret;
    }
    void afisare() {
        cout << "Pret Produs Software Este : " << pret << endl;
    }
    void afisaresoft() {
        cout << "Pret Produs Software Este : " << pret << endl;
    }
    int getpret() {
        return pret;
    }
};

class Piesa {
    char cod[6];
    int pret;
    public:
        Piesa() {
            strcpy(cod, "0");
            pret = 0;
        }
    Piesa(char cod_a[6], int pret_a) {
        strcpy(cod, cod_a);
        pret = pret_a;
    }
    int pretpiesa() {
        return pret;
    }
    void afispiesa() {
        cout << "Cod Piesa: " << cod << endl;
        cout << "Pret Piesa: " << pret << endl;
    }
};

class Modul_Hardware: public Produs {
    protected: vector < Piesa > vec;
    int nr_piesa;
    int pm;
    int nr_ore;
    public: Modul_Hardware() {
        vec.clear();
        nr_piesa = 0;
        pm = 0;
        nr_ore = 0;
    }
    Modul_Hardware(vector < Piesa > vec_a, int nr_piesa_a, int pm_a, int nr_ore_a) {
        nr_piesa = nr_piesa_a;
        vec.resize(nr_piesa);
        for (int i = 0; i < nr_piesa; i++) {
            vec[i] = vec_a[i];
        }
        pm = pm_a;
        nr_ore = nr_ore_a;
    }
    void afisare() {
        cout << "Numar de piese este: " << nr_piesa << endl;
        for (int i = 0; i < nr_piesa; i++) {
            vec[i].afispiesa();
        }
        cout << "Pret Manopera: " << pm << endl;
        cout << "Numar de Ore: " << nr_ore << endl;
    }
    int getpret() {
        int pret = 0;
        for (int i = 0; i < nr_piesa; i++) {
            pret = pret + vec[i].pretpiesa();
        }
        pret = pret + (pm * nr_ore);
        return pret;
    }
};

class Produs_Mixt: public Modul_Hardware {
    Produs_Software ps;
    vector < string > functionalitati;
    int nr_functionalitati;
    public:
        Produs_Mixt() {
            Produs_Software();
            functionalitati.clear();
            nr_functionalitati = 0;
        }

    Produs_Mixt(vector < Piesa > vec_a, int nr_piesa_a, int pm_a, int nr_ore_a, Produs_Software ps_a, vector < string > functionalitati_a, int nr_functionalitati_a): Modul_Hardware(vec_a, nr_piesa_a, pm_a, nr_ore_a) {
        ps = ps_a;
        nr_functionalitati = nr_functionalitati_a;
        functionalitati.resize(nr_functionalitati);
        for (int i = 0; i < nr_functionalitati; i++) {
            functionalitati[i] = functionalitati_a[i];
        }
    }

    void afisare() {
        Modul_Hardware::afisare();
        ps.afisaresoft();
        cout << "Numar de functionalitati : " << nr_functionalitati << endl;
        for (int i = 0; i < nr_functionalitati; i++) {
            cout << "Functionalitatea cu numarul " << i << ": ";
            cout << functionalitati[i];
        }
    }
    int getpret() {
        int pret = 0;
        pret = ps.getpret() + Modul_Hardware::getpret();
        return pret;
    }
};

int main() {
    int n;
    cout << "Dimensiune Vector: ";
    cin >> n;
    vector < Produs * > vp;
    vp.resize(n);
    for (int i = 0; i < n; i++) {
        int a;
        cout << "Alegeti Tipul de Produs: " << endl;
        cout << "[1]-Produs Software." << endl;
        cout << "[2]-Modul Hardware." << endl;
        cout << "[3]-Produs Mixt." << endl;
        cout << "Alegeti Tipul: ";
        cin >> a;

        switch (a) {

        case 1: {

            int pret1;
            cout << "Pretul Produsului Software: ";
            cin >> pret1;
            vp.push_back(new Produs_Software(pret1));
        }

        break;

        case 2: {
            int b;
            int pret;
            char cod[6];
            vector < Piesa > vec;
            cout << "Numarul de Piese: ";
            cin >> b;
            vec.resize(b);
            for (int i = 0; i < b; i++) {
                cout << "Codul Produsului: ";
                cin >> cod;
                cout << "Pretul Produsului: ";
                cin >> pret;
                vec.push_back(Piesa(cod, pret));
            }
            int pm;
            cout << "Pret Manopera pe ora: ";
            cin >> pm;
            int ore;
            cout << "Numar Ore dezvoltare: ";
            cin >> ore;
            vp.push_back(new Modul_Hardware(vec, b, pm, ore));
        }
        break;

        case 3: {
            int b;
            int pret;
            char cod[6];
            vector < Piesa > vec;
            cout << "Numarul de Piese: ";
            cin >> b;
            vec.resize(b);
            for (int i = 0; i < b; i++) {
                cout << "Codul Produsului: ";
                cin >> cod;
                cout << "Pretul Produsului: ";
                cin >> pret;
                vec.push_back(Piesa(cod, pret));
            }
            int pm;
            cout << "Pret Manopera pe ora: ";
            cin >> pm;
            int ore;
            cout << "Numar Ore dezvoltare: ";
            cin >> ore;
            Produs_Software ps;
            ps.SetProdus();
            int c;
            cout << "Numarul De Functionalitati: ";
            cin >> c;
            string functionalitate;
            vector < string > functionalitati;
            for (int i = 0; i < c; i++) {
                cout << "Functionalitatea cu numarul: " << i << ": ";
                cin >> functionalitate;
                functionalitati.push_back(string(functionalitate));
            }
            vp.push_back(new Produs_Mixt(vec, b, pm, ore, ps, functionalitati, c));
        }
        break;
        }
    }
    vector < Produs * > ::iterator it;
    vector < Produs * > vp1;
    vp.erase(vp.begin(), vp.begin() + 2);
    it = vp.begin();
    int c;
    int z;
    cout << "Alegeti Tipul de Produs: " << endl;
    cout << "[1]-Produs Software." << endl;
    cout << "[2]-Modul Hardware." << endl;
    cout << "[3]-Produs Mixt." << endl;
    cin >> c;
    cout << "Alegeti Pozitia: ";
    cin >> z;

    switch (c) {
    case 1: {
        int pret1;
        cout << "Pret Produs Software: ";
        cin >> pret1;
        vp1.push_back(new Produs_Software(pret1));
        vp.insert(it + z, vp1.begin(), vp1.end());
    }
    break;
    case 2: {
        int b;
        int pret;
        char cod[6];
        vector < Piesa > vec;
        cout << "Numar de Piese: ";
        cin >> b;
        vec.resize(b);
        for (int i = 0; i < b; i++) {
            cout << "Cod Produs: ";
            cin >> cod;
            cout << "Pret Produs: ";
            cin >> pret;
            vec.push_back(Piesa(cod, pret));
        }
        int pm;
        cout << "Pret Manopera pe ora: ";
        cin >> pm;
        int ore;
        cout << "Numar Ore dezvoltare: ";
        cin >> ore;
        vp1.push_back(new Modul_Hardware(vec, b, pm, ore));
        vp.insert(it + z, vp1.begin(), vp1.end());
    }
    break;
    case 3: {
        int b;
        int pret;
        char cod[6];
        vector < Piesa > vec;
        cout << "Numar de Piese: ";
        cin >> b;
        vec.resize(b);
        for (int i = 0; i < b; i++) {
            cout << "Cod Produs: ";
            cin >> cod;
            cout << "Pret Produs: ";
            cin >> pret;
            vec.push_back(Piesa(cod, pret));
        }
        int pm;
        cout << "Pret Manopera pe ora: ";
        cin >> pm;
        int ore;
        cout << "Numar Ore dezvoltare: ";
        cin >> ore;
        Produs_Software ps;
        ps.SetProdus();
        int c;
        cout << "Numar De Functionalitati: ";
        cin >> c;
        string functionalitate;
        vector < string > functionalitati;
        for (int i = 0; i < c; i++) {
            cout << "Functionalitatea cu numarul " << i+1 << ": ";
            cin >> functionalitate;
            functionalitati.push_back(string(functionalitate));
        }
        vp1.push_back(new Produs_Mixt(vec, b, pm, ore, ps, functionalitati, c));
        vp.insert(it + z, vp1.begin(), vp1.end());
    }
    }
    return 0;
}
