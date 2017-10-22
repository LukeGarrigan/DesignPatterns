package Characters;

import Weapons.SwordBehaviour;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class King extends Character {

    public King(){
        weapon = new SwordBehaviour();
    }

    @Override
    public void fight() {
        System.out.print("The King: ");
        weapon.useWeapon();
    }
}
