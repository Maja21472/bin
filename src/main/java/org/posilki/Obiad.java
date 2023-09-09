package org.posilki;
import java.util.Random;
public class Obiad {
        private String[] bialko = {"kurczak", "tofu", "fasola"};
        private String[] wegle = {"ryż", "makaron", "kasza"};
        private String[] surowka = {"ogórek", "papryka", "pomidor"};

        public Obiad() {
            Random random = new Random();
            int bialkoIndex = random.nextInt(bialko.length);
            int wegleIndex = random.nextInt(wegle.length);
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
