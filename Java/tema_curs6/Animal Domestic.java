package Mamifer;

public class AnimalDomestic extends Mamifer {
    @Override
    void locuieste(String locDormit, String continent)
    {
        System.out.println("Doarme in "+ locDormit+" si se afla pe continentul " + continent);
        
    }
    @Override
    void delimiteazaTeritoriul( String marcaj)
    {
     System.out.println("Isi delimiteaza teritoriul prin "+ marcaj);
    }
    AnimalDomestic(String nume, int greutate, String continent, String marcaj, String locDormit, String mancare)
    {
        super(nume,greutate,continent,marcaj,locDormit,mancare);
    }
    }