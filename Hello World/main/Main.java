package main;

import main.lemonstn.LemonJuice;
import main.lemonstn.Lemonade;
import main.lemonstn.Sugar;
import main.lemonstn.Water;

public class Main {
    int x = 5;

    String hello = "Hello World";
    public static void main(String[] args) {
        LemonJuice lemonJuice = new LemonJuice(5, "ounces");
        Sugar sugar = new Sugar(4, "tsp");
        Water water = new Water(3, "cups");

        Lemonade lemonade = new Lemonade(lemonJuice, sugar, water);

        System.out.println(lemonade.getWater());

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

    }

}
