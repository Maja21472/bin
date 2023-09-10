package org.posilki;
import java.util.Random;

/**
 * klasa losująca kolację - tym razem tylko 1 element
 */
public class Kolacja {
    String[] baza = {"pierogi", "pizza", "omlet"};
    /**
     * Konstruktor klasy Kolacja.
     * Tworzy obiekt kolacja, wybierając losowo posiłek.
     */
    public Kolacja(String[] baza) {
        this.baza = baza;
    }

    public Kolacja() {
        Random random = new Random();
        int bazaIndex = random.nextInt(baza.length);

        String wybranaBaza = baza[bazaIndex];

        //System.out.println("Twoja kolacja: " + wybranaBaza + ".");
    }
    /**
     * Metoda zwracająca opis kolacji.
     *
     * @return Opis śniadania w formacie "Twoje śniadanie: [baza]."
     */
    public String getOpis() {
        Random random = new Random();
        int bazaIndex = random.nextInt(baza.length);

        String wybranaBaza = baza[bazaIndex];


        return "Twoja kolacja: " + wybranaBaza + ".";
    }

    public static void main(String[] args) {
        Kolacja kolacja = new Kolacja();
        System.out.println(kolacja.getOpis());
    }
}