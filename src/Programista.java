public class Programista extends Pracownik{
  private String glownyJezyk;
  private int liczbaRepozytoriow;

  public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa , String glownyJezyk, int liczbaRepozytoriow) {
      super(idPracownika, imie, nazwisko, stawkaBazowa);
      this.glownyJezyk = glownyJezyk;
      this.liczbaRepozytoriow = liczbaRepozytoriow;
  }
  public String getGlownyJezyk() {
    return glownyJezyk;
  }
  public int getLiczbaRepozytoriow() {
      return liczbaRepozytoriow;
  }
@Override
public double obliczKosztMiesieczny() {
      double koszt = getStawkaBazowa();
      if(glownyJezyk.equals("Java")){
          koszt +=40.0;
      }
      if(liczbaRepozytoriow > 3){
          koszt +=70.0;
      }
      return koszt;
}
@Override
public String przedstawSie() {
      return "Pracownik: " + pobierzIdPracownika() + "\nImie: " + getImie() + "\nNazwisko: " + getNazwisko() + "\nGlowny Jezyk: " + getGlownyJezyk() + "\nLiczba Repozytoriow: " + getLiczbaRepozytoriow();
}

public void wypiszTechnologie(){
      System.out.println("Pracownik "+ pobierzIdPracownika() + " zna " + glownyJezyk);
}

public String toString(){
      return "Programista{" +
              "idPracownika=" + pobierzIdPracownika() +
              ", imie=" + getImie() +
              ", nazwisko=" + getNazwisko() +
              ", stawka bazowy=" + getStawkaBazowa() +
              ", glowny jezyk=" + getGlownyJezyk() +
              ", liczba repozytoriow=" + getLiczbaRepozytoriow() +
              '}';

}
}
