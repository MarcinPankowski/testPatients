package pl.michalczukm.isa.java;

/**
 * Created by marcinpankowski on 11.09.16.
 */
public class Doctor {
    private String imie;
    private String nazwisko;

    public Doctor(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }


    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}
