import java.util.ArrayList;

public class ZespolProjektowy {
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu){
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }
    public void dodajPracownika(Pracownik pracownik){
        this.pracownicy.add(pracownik);
    }
    public void wypiszSkladZespolu(){
        System.out.println("--------Sklad Zespolu--------");
        for(Pracownik p :  pracownicy){
            System.out.println(p.przedstawSie());
            System.out.println("--------------------------");
        }
    }
    public double policzLacznyKoszt(){
        double laczyKoszt = 0;
        for(Pracownik p :  pracownicy){
            laczyKoszt += p.obliczKosztMiesieczny();
        }
        return laczyKoszt;
    }
    public Pracownik znajdzPoId(String idPracownika) {
        for(Pracownik pracownik : pracownicy){
            if(pracownik.pobierzIdPracownika().equals(idPracownika)){

            }
        }
        return null;
    }
    public void wypiszProgramistow(){
        System.out.println("--------Programiści--------");
        for(Pracownik pracownik : pracownicy){
            if(pracownik instanceof Programista);
                Programista programista = (Programista) pracownik;

                System.out.println(pracownik.przedstawSie());
                System.out.println("-----------------------");
        }
    }
}


