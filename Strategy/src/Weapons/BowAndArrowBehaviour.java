package Weapons;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class BowAndArrowBehaviour implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shooting an arrow");
    }
}
