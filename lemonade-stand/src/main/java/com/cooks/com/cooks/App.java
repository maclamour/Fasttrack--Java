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
        order1.addLemonade(new Lemonade(5, 3, 3, 4));
        System.out.println(order1.getTotal());

        Order order2 = new Order(customer2);
        order2.addLemonade(new Lemonade(2, 4, 6, 7));
        System.out.println(order2.getTotal());

        
        
    }
}
