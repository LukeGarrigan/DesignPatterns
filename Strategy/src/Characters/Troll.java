package Characters;

import Weapons.KnifeBehaviour;

/**
 * @author Luke Garrigan
 * Date: 22-Oct-17
 */
public class Troll extends Character {

    public Troll(){
        weapon = new KnifeBehaviour();
    }

    @Override
    public void fight() {
        System.out.print("Troll: ");
        weapon.useWeapon();
    }
}
