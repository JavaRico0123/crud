package cz.itnetwork.evidencepojisteni;

import java.util.Scanner;
public class EvidencePojisteni {

    public static void generujRozcestnik()
    {
        System.out.println("-----------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("-----------------------------\n");

        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat včechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
        System.out.print("Zadejte prosím čislo : ");
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Pojisteny pojisteny = new Pojisteny();
        String volba = "";

        EvidencePojisteni.generujRozcestnik();

        while (!volba.equals("4")) {

            volba = sc.nextLine();
            System.out.println();
            // reakce na volbu
            switch (volba) {
                case "1":
                    pojisteny.pridejZaznam();
                    break;
                case "2":
                    pojisteny.vypsatZaznamy();
                    break;
                case "3":
                    pojisteny.vyhledatZaznamy();
                    break;
                case "4":
                    System.out.println("Libovolnou klávesou ukončíte program...");
                    break;
                default:
                    EvidencePojisteni.generujRozcestnik();
                    break;
            }
        }
    }
}
