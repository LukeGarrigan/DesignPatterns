package Weapons;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class SwordBehaviour  implements WeaponBehavior{


    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword");
    }
}
