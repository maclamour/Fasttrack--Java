package lemonadestand.model

import java.util.Arrays;

public class Order {

    private Customer customer;

    private Lemonade[] lemonades;

    private double total;

    public Order(Customer customer) {
        super();
        this.customer = customer;
        lemonades = new Lemonade[0];
    }

    private void updateTotal(){
        for (Lemonade l: lemonades){
            total += l.getPrice();
        }
    }

    public void addLemonade(Lemonade lemonade) {
        Lemonade[] temp = Arrays.copyOf(lemonades, lemonades.length + 1);
        temp[temp.length - 1] = lemonade;
        lemonades = temp;
    }
}
