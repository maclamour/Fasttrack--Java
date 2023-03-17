package main.lemonstn;

public class Lemonade {
    LemonJuice lemonJuice;
    Sugar sugar;
    Water water;

    public Lemonade(LemonJuice lemonJuice, Sugar sugar, Water water) {
        this.lemonJuice = lemonJuice;
        this.sugar = sugar;
        this.water = water;
    }

    public Lemonade(LemonJuice lemonJuice, Water water){
        this.lemonJuice = lemonJuice;
        this.water = water;
        sugar = new Sugar(0, "none");
    }
}
    
