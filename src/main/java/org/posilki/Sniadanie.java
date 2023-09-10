package org.posilki;
import java.util.Arrays;
import java.util.Random;

/**
 * Klasa losująca przykładowe śniadanie.
 */
class Sniadanie {
    String[] baza = {"jajecznica", "naleśniki", "owsianka"};
    String[] owoc = {"truskawki", "borówki", "jabłko"};
    String[] dodatek = {"skyr", "baton proteinowy", "serek wiejski"};

    /**
     * Konstruktor klasy Sniadanie.
     * Tworzy obiekt śniadania, wybierając losowo składniki z dostępnych baz, owoców i dodatków.
     */
    public Sniadanie(String[] baza, String[] owoc, String[] dodatek) {
        this.baza = baza;
        this.owoc = owoc;
        this.dodatek = dodatek;
    }

    public Sniadanie() {
        Random random = new Random();
        int bazaIndex = random.nextInt(baza.length);
        int owocIndex = random.nextInt(owoc.length);
        int dodatekIndex = random.nextInt(dodatek.length);

        String wybranaBaza = baza[bazaIndex];
        String wybranyOwoc = owoc[owocIndex];
        String wybranyDodatek = dodatek[dodatekIndex];

        //System.out.println("Twoje śniadanie: " + wybranaBaza + ", " + wybranyOwoc + " i " + wybranyDodatek + ".");

    }
    /**
     * Metoda zwracająca opis śniadania.
     *
     * @return Opis śniadania w formacie "Twoje śniadanie: [baza], [owoc] i [dodatek]."
     */
    public String getOpis() {
        Random random = new Random();
        int bazaIndex = random.nextInt(baza.length);
        int owocIndex = random.nextInt(owoc.length);
        int dodatekIndex = random.nextInt(dodatek.length);

        String wybranaBaza = baza[bazaIndex];
        String wybranyOwoc = owoc[owocIndex];
        String wybranyDodatek = dodatek[dodatekIndex];

        return "Twoje śniadanie: " + wybranaBaza + ", " + wybranyOwoc + " i " + wybranyDodatek + ".";
    }
    public static void main(String[] args) {
        Sniadanie sniadanie = new Sniadanie();
        System.out.println(sniadanie.getOpis());
    }
}