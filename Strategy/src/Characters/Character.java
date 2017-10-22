package Characters;

import Weapons.WeaponBehavior;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public abstract class Character {
    WeaponBehavior weapon;

    public Character(){}


    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }
    public abstract void fight();

}
