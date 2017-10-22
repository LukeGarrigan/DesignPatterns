package com.company;

import com.company.Ingredients.NYPizzaIngredientFactory;
import com.company.Ingredients.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            pizza =  new CheesePizza(ingredientFactory);
            pizza.setName("New york cheese pizza");
        }else if(item.equals("meat")){
            pizza = new MeatPizza(ingredientFactory);
            pizza.setName("New york meat pizza");
        }
        return pizza;
    }
}
