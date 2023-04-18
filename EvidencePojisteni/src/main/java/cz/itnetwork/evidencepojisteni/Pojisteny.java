package cz.itnetwork.evidencepojisteni;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Pojisteny {
  private Databaze databaze;
    // instance scanneru pro čtení vstupu z konzole
    private Scanner sc = new Scanner(System.in, "Windows-1250");

    public Pojisteny() {
        databaze = new Databaze();
    }

    public void vypsatZaznamy() {
        ArrayList<Zaznam> zaznamy = databaze.vratZaznamy();
        for (Zaznam z : zaznamy) {
            System.out.println(z);
        }
    }

    public void vyhledatZaznamy() {
        // získávání informací od uživatele
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine();

        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = sc.nextLine();


        for (Zaznam polozkaDatabaze:databaze.vratZaznamy()){

            if (jmeno.equals(polozkaDatabaze.getJmeno()) && prijmeni.equals(polozkaDatabaze.getPrijmeni())) {
                System.out.println(polozkaDatabaze);
            }

        }

    }
    public void pridejZaznam() {

        // získávání informací od uživatele
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine();

        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = sc.nextLine();

        System.out.println("Zadejte telefonní číslo:");
        String cislo = sc.nextLine();

        System.out.println("Zadejte věk:");
        Integer vek = Integer.parseInt(sc.nextLine());

        //vložení informací do DB
        databaze.pridejZaznam(jmeno, prijmeni, cislo, vek);

        System.out.println("Data byla uložena. Pokračujte libovolnou klávesou...");
    }



}








