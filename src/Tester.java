public class Tester extends pracownik {

    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny() {
        return super.obliczKosztMiesieczny();
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie();
    }

    public void uruchomRaportTestow() {
        System.out.println("----- RAPORT TESTOW -----");
        System.out.println("Liczba sprawdzonych scenariuszy:" + liczbaScenariuszy);
        if (czyAutomatyzujacy) {
            System.out.println("Status: Testy atumatyczne zakonczone sukcesem");
        } else {
            System.out.println("Status: Testy manulane wyamgaja zatwierdzenia");
        }
        System.out.println("-------------------------");
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }
}
