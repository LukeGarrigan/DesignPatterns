package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("meat");
        System.out.println("I ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Sinead ordered a " + pizza.getName());

    }
}
