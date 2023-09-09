package org.posilki;
import java.util.Random;

public class Kolacja {
    String[] baza = {"pierogi", "pizza", "omlet"};

    public Kolacja(String[] baza) {
        this.baza = baza;
    }

    public Kolacja() {
        Random random = new Random();
        int bazaIndex = random.nextInt(baza.length);

        String wybranaBaza = baza[bazaIndex];

        //System.out.println("Twoja kolacja: " + wybranaBaza + ".");
    }

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