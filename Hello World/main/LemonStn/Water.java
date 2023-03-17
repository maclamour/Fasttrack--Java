package main.lemonstn;

public class Water {
    public int amount;
    public String unit;

    public Water(int amount, String unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public void drink(int amount) throws IllegalAccessException {
        if (this.amount < amount) {
            throw new IllegalAccessException(
                    "Cannot drink more than available. Amount of water available: " + this.amount);
        } else {
            this.amount -= amount;
        }

    }

}
