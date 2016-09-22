package edu.fsu.cs.cen5035;

/**
 *
 * @author Andrew
 */
public class Arrow extends BasicWeapon implements Weapon {

    public Arrow() {
        super(70);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        armor = armor - 5;
        armor = (armor < 0) ? 0 : armor;

        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
