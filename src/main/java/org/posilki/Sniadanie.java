package org.posilki;
import java.util.Random;

public class Sniadanie {
    private String[] baza = {"jajecznica", "naleśniki", "owsianka"};
    private String[] owoc = {"truskawki", "borówki", "jabłko"};
    private String[] dodatek = {"skyr", "baton proteinowy", "serek wiejski"};

    public Sniadanie() {
        Random random = new Random();
        int bazaIndex = random.nextInt(baza.length);
        int owocIndex = random.nextInt(owoc.length);
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