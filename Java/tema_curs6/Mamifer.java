package Mamifer;

public abstract class  Mamifer {
    String nume, continent, marcaj, locDormit, mancare;
    int greutate;
    Mamifer(String nume, int greutate, String continent, String marcaj, String locDormit, String mancare)
    {
        this.nume=nume;
        this.greutate=greutate;
        this.continent=continent;
        this.marcaj=marcaj;
        this.locDormit=locDormit;
        this.mancare=mancare;
    }
    abstract void locuieste(String locDormit, String continent);
    abstract void delimiteazaTeritoriul( String marcaj);
    void setMananca(String mancare)
    {
        this.mancare=mancare;
    }
}
