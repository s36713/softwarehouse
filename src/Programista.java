public class Programista extends pracownik {
    private String glownyjezyk;
    private int liczbarepozytoiow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyjezyk, int liczbarepozytoiow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyjezyk = glownyjezyk;
        this.liczbarepozytoiow = liczbarepozytoiow;
    }

}
