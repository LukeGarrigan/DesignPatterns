package Weapons;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class KnifeBehaviour implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("cutting with a knife");
    }
}
