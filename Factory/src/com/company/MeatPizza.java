package com.company;

import com.company.Ingredients.PizzaIngredientFactory;

public class MeatPizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;
    public MeatPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
