package org.posilki;
import java.util.Random;
public class Obiad {

    public Obiad() {
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

            System.out.println("Twój obiad: " + wybraneBialko + ", " + wybraneWegle + " i " + wybranaSurowka + ".");
        }

        public static void main(String[] args) {
            org.posilki.Obiad Obiad = new org.posilki.Obiad();
        }
    }
