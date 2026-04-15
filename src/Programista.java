public class Programista extends pracownik {
    private String glownyjezyk;
    private int liczbarepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyjezyk, int liczbarepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyjezyk = glownyjezyk;
        this.liczbarepozytoriow = liczbarepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny() {
        return super.obliczKosztMiesieczny();
    }
    @Override
    public String przedstawSie() {
        return super.przedstawSie();
    }
    public void wypiszTechnologie(){
        System.out.println("Glowny jezyk:" + glownyjezyk );
        System.out.println("Liczba zarzadzanych repozytoriow" + liczbarepozytoriow);
    }
}
