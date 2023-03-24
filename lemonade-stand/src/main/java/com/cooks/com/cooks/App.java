package com.cooks;

import lemonadestand.model.Customer;
import lemonadestand.model.Lemonade;
import lemonadestand.model.Order;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mackenzie", "(999)-999-999");
        Customer customer2 = new Customer("Karen", "(999)-999-999");

        Order order1 = new Order(customer1);

        order1.addLemonade(new Lemonade(7, 8, 3, 4));
        order1.addLemonade(new Lemonade(3, 7, 9, 8));

        for (Lemonade l : order1.getLemonades()){
            System.out.println(l.getPrice());
        }

        System.out.println(order1.getTotal());

        Order order2 = new Order(customer2);
        order2.addLemonade(new Lemonade(2.5, 4, 6.76, 7));
        System.out.println(order2.getTotal());

    }
}
