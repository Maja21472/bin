package org.posilki;

public class Jadlospis {
    public static void main(String[] args) {
        Sniadanie sniadanie = new Sniadanie();
        Obiad obiad = new Obiad();

        System.out.println("Jadłospis:");
        System.out.println(sniadanie.getOpis());
        System.out.println(obiad.getOpis());
    }}
