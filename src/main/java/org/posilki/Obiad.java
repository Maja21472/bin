package org.posilki;
import java.util.Random;

/**
 * Klasa losująca obiad z podanych składników
 */
public class Obiad {
    String[] bialko = {"kurczak", "tofu", "fasola"};
    String[] wegle = {"ryż", "makaron", "kasza"};
    String[] surowka = {"ogórek", "papryka", "pomidor"};
    /**
     * Konstruktor klasy Obiad.
     * Tworzy obiekt obiad, wybierając losowo składniki z dostępnych białek, węgli i surówki.
     */
    public Obiad(String[] bialko, String[] wegle, String[] surowka) {
        this.bialko = bialko;
        this.wegle = wegle;
        this.surowka = surowka;
    }

    public Obiad() {
            Random random = new Random();
            int bialkoIndex = random.nextInt(bialko.length);
            int wegleIndex = random.nextInt(wegle.length);
            int surowkaIndex = random.nextInt(surowka.length);

            //String wybraneBialko = bialko[bialkoIndex];
            //String wybraneWegle = wegle[wegleIndex];
            //String wybranaSurowka = surowka[surowkaIndex];


            //System.out.println("Twój obiad: " + wybraneBialko + ", " + wybraneWegle + " i " + wybranaSurowka + ".");
        }
    /**
     * Metoda zwracająca opis obiadu.
     *
     * @return Opis obiadu w formacie "Twój obiad: [bialko], [wegle] i [surowka]."
     */
    public String getOpis() {
        Random random = new Random();
        String[] bialko = {"kurczak", "tofu", "fasola"};
        int bialkoIndex = random.nextInt(bialko.length);
        String[] wegle = {"ryż", "makaron", "kasza"};
        int wegleIndex = random.nextInt(wegle.length);
        String[] surowka = {"ogórek", "papryka", "pomidor"};
        int surowkaIndex = random.nextInt(surowka.length);

        String wybraneBialko = bialko[bialkoIndex];
        String wybraneWegle = wegle[wegleIndex];
        String wybranaSurowka = surowka[surowkaIndex];

        return "Twój obiad: " + wybraneBialko + ", " + wybraneWegle + " i " + wybranaSurowka + ".";
    }

    public static void main(String[] args) {
        Obiad obiad = new Obiad();
        System.out.println(obiad.getOpis());
    }
}