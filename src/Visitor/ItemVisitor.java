package Visitor;

import Element.Armor;
import Element.Potion;
import Element.Weapon;

public interface ItemVisitor {
    void visitPotion(Potion potion);
    void visitWeapon(Weapon weapon);

    void visitArmor(Armor armor);
}
