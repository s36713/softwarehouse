import java.util.Objects;

public class pracownik {
    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;

    public pracownik(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;
    }

    public final String pobierzIdPracownika() {
        return idPracownika;
    }

    public double obliczKosztMiesieczny() {
        return stawkaBazowa;

    }

    public String przedstawSie() {
        return imie + " " + nazwisko;
    }

    @Override
    public String toString() {
        return "pracownik{" +
                "idPracownika='" + idPracownika + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        pracownik pracownik = (pracownik) o;
        return Objects.equals(idPracownika, pracownik.idPracownika);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPracownika);
    }

}
