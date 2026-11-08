package Visitor;

import Element.Armor;
import Element.Potion;
import Element.Weapon;

public class WeightCalculatorVisitor implements ItemVisitor {
    private double totalWeight = 0.0;

    @Override
    public void visitWeapon(Weapon weapon) {
        totalWeight += weapon.getWeight();
        System.out.println(" • [Weapon] " + weapon.getName() + " - Weight: " + weapon.getWeight() + " kg");
    }

    @Override
    public void visitArmor(Armor armor) {
        totalWeight += armor.getWeight();
        System.out.println(" • [Armor] " + armor.getName() + " - Weight: " + armor.getWeight() + " kg");
    }

    @Override
    public void visitPotion(Potion potion) {
        totalWeight += potion.getWeight();
        System.out.println(" • [Potion] " + potion.getName() + " - Weight: " + potion.getWeight() + " kg");
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}