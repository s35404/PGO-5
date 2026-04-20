public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy){
    super(idPracownika, imie, nazwisko, stawkaBazowa);
    this.czyAutomatyzujacy = czyAutomatyzujacy;
    this.liczbaScenariuszy = liczbaScenariuszy;
}
public boolean getczyAutomatyzujacy(){
    return czyAutomatyzujacy;
}
public int getLiczbaScenariuszy(){
    return liczbaScenariuszy;
}
@Override
    public double obliczKosztMiesieczny(){
    double koszt = getStawkaBazowa();
    if(czyAutomatyzujacy == true){
        koszt +=200.0;
    }
    if(liczbaScenariuszy > 30){
        koszt +=100.0;
    }
    return koszt;
}
@Override
    public String przedstawSie() {
        return "Pracownik: " + pobierzIdPracownika() + "\nImie: " + getImie() + "\nNazwisko: " + getNazwisko() + "\nCzy Automatyzujacy: " + getczyAutomatyzujacy() + "\nLiczba Scenariuszy" + getLiczbaScenariuszy();
    }
    public void uruchomRaportTestow() {
        if (czyAutomatyzujacy == true) {
            System.out.println("Pracownik " + pobierzIdPracownika() + "ma zautomatyzowany system.");
        } else {
        }
        System.out.println("Pracownik " + pobierzIdPracownika() + " nie ma zautomatyzowanego system.");
    }
}
