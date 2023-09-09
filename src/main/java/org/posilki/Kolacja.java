package org.posilki;
import java.util.Random;

public class Kolacja {

    public Kolacja() {
        Random random = new Random();
        String[] baza = {"pierogi", "pizza", "omlet"};
        int bazaIndex = random.nextInt(baza.length);

        String wybranaBaza = baza[bazaIndex];

        System.out.println("Twoja kolacja: " + wybranaBaza + ".");
    }

    public static void main(String[] args) {
        Kolacja Kolacja = new Kolacja();
    }
}