package main;

import main.lemonstn.LemonJuice;
import main.lemonstn.Sugar;
import main.lemonstn.Water;

public class Main {
    public static void main(String[] args){
        Water waterOne = new Water(5, "cups");
        System.out.println(waterOne.amount + " " + waterOne.unit);

        Sugar sugarOne = new Sugar(2, "tsps");
        System.out.println(sugarOne.amount + " " + sugarOne.unit);
        
        LemonJuice lemonJuiceOne = new LemonJuice(5, "tsps");
        System.out.println(lemonJuiceOne.amount + " " + lemonJuiceOne.unit);
    }
    
}
