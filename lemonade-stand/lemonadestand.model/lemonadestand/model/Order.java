package lemonadestand.model;

import java.util.Arrays;

public class Order {

    private Customer customer;

    private Lemonade[] lemonades;

    private double total;

    public Order(Customer customer) {
        super();
        this.customer = customer;
        lemonades = new Lemonade[0];
        total = 0.0;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Lemonade[] getLemonades() {
        return this.lemonades;
    }

    public double getTotal() {
        return this.total;
    }

    private void updateTotal() {
        for (Lemonade l : lemonades) {
            total += l.getPrice();
        }
    }

    public void addLemonade(Lemonade lemonade) {
        Lemonade[] newLemonadeArray = Arrays.copyOf(lemonades, lemonades.length + 1);
        newLemonadeArray[newLemonadeArray.length - 1] = lemonade;
        lemonades = newLemonadeArray;
        updateTotal();
    }
}
