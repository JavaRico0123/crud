package cz.itnetwork.evidencepojisteni;

import java.time.LocalDateTime;

public class Zaznam {
    //private LocalDateTime datumCas;
    private String jmeno;
    private String prijmeni;
    private String telefon;
    private Integer vek;

    public Zaznam(String jmeno, String prijmeni, String telefon, Integer vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefon = telefon;
        this.vek = vek;

    }

    public String getJmeno() {
        return this.jmeno;
    }

    public String getPrijmeni() {
        return this.prijmeni;
    }

    @Override
    public String toString() {
        return this.jmeno + " " + this.prijmeni + " " + this.telefon + " " + this.vek + " ";
    }
}
