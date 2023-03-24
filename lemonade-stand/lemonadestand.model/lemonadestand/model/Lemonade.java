package lemonadestand.model

public class Lemonade {

    private double lemonJucie;
    
    private double water;
    
    private double sugar;
    
    private int iceCubes;
    
    private final int CUP = 1;
    
    private double price;

    

    public Lemonade(double lemonJucie, double water, double sugar, int iceCubes) {
        super();
        this.lemonJucie = lemonJucie;
        this.water = water;
        this.sugar = sugar;
        this.iceCubes = iceCubes;
        calculatePrice();

    }

    public double getLemonJucie() {
        return this.lemonJucie;
    }

    public double getWater() {
        return this.water;
    }

    public double getSugar() {
        return this.sugar;
    }

    public int getIceCubes() {
        return this.iceCubes;
    }

    public int getCUP() {
        return this.CUP;
    }

    public double getPrice() {
        return this.price;
    }

    private void calculatePrice() {
        price = (lemonJucie * .3) + (sugar * .15) + (CUP * .50);
    }

}

