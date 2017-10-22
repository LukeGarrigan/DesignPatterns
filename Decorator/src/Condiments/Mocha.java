package Condiments;

import com.company.Beverage;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
