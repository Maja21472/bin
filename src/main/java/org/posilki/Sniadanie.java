package org.posilki;
import java.util.Random;

public class Sniadanie {

    public Sniadanie() {
        Random random = new Random();
        String[] baza = {"jajecznica", "naleśniki", "owsianka"};
        int bazaIndex = random.nextInt(baza.length);
        String[] owoc = {"truskawki", "borówki", "jabłko"};
        int owocIndex = random.nextInt(owoc.length);
        String[] dodatek = {"skyr", "baton proteinowy", "serek wiejski"};
        int dodatekIndex = random.nextInt(dodatek.length);

        String wybranaBaza = baza[bazaIndex];
        String wybranyOwoc = owoc[owocIndex];
        String wybranyDodatek = dodatek[dodatekIndex];

        System.out.println("Twoje śniadanie: " + wybranaBaza + ", " + wybranyOwoc + " i " + wybranyDodatek + ".");
    }

    public static void main(String[] args) {
        Sniadanie Sniadanie = new Sniadanie();
    }
}