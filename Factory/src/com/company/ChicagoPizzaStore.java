package com.company;

import com.company.Ingredients.ChicagoPizzaIngredientFactory;
import com.company.Ingredients.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
    Pizza pizza = null;

    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago cheesy pizza");
        }
        return pizza;
    }
}
