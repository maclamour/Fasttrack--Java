package main.lemonstn;

public class Lemonade {
   private LemonJuice lemonJuice;
   private Sugar sugar;
   private Water water;

    public LemonJuice getLemonJuice() {
        return this.lemonJuice;
    }

    public void setLemonJuice(LemonJuice lemonJuice) {
        this.lemonJuice = lemonJuice;
    }

    public Sugar getSugar() {
        return this.sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    public Water getWater() {
        return this.water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

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
    
