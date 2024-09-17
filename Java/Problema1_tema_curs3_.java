public class Fructe {
    String culoare, nume;
    int greutate, diametru;
    void afis()
    {
        System.out.println("Culoare: "+culoare);
        System.out.println("Nume: "+nume);
        System.out.println("Greutate: "+greutate);
        System.out.println("Diametru: "+diametru);
        System.out.println();
    }
    Fructe()
    {
        culoare = null;
        nume = null;
        greutate = 0;
        diametru = 0;
    }
    Fructe(String P_cul,String P_nu)
    {
        culoare = P_cul;
        nume = P_nu;
        greutate = 0;
        diametru = 0;
    }
    Fructe(String P_cul,String P_nu,int P_greut,int P_diam)
    {
        culoare = P_cul;
        nume = P_nu;
        greutate = P_greut;
        diametru = P_diam;
    }
}