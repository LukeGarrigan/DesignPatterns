package Condiments;

import com.company.Beverage;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
