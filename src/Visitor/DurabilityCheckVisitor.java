package Visitor;

import Element.Armor;
import Element.Potion;
import Element.Weapon;

public class DurabilityCheckVisitor implements ItemVisitor {
    private int totalRepairCost = 0;

    @Override
    public void visitWeapon(Weapon weapon) {
        int missingDurability = weapon.getMaxDurability() - weapon.getCurrentDurability();
        int repairCost = missingDurability * 5;
        totalRepairCost += repairCost;
        System.out.println(" • [Blacksmith - Weapon] " + weapon.getName() + ": Durability [" + weapon.getCurrentDurability() + "/" + weapon.getMaxDurability() + "]" + (repairCost > 0 ? " -> Needs repair! Cost: " + repairCost + " gold." : " -> Excellent condition!"));
    }

    @Override
    public void visitArmor(Armor armor) {
        int missingDurability = armor.getMaxDurability() - armor.getCurrentDurability();
        int repairCost = missingDurability * 8;
        totalRepairCost += repairCost;
        System.out.println(" • [Blacksmith - Armor] " + armor.getName() + ": Durability [" + armor.getCurrentDurability() + "/" + armor.getMaxDurability() + "]" + (repairCost > 0 ? " -> Needs repair! Cost: " + repairCost + " gold." : " -> Excellent condition!"));
    }

    @Override
    public void visitPotion(Potion potion) {
        System.out.println(" • [Blacksmith - Potion] " + potion.getName() + ": Consumable item. No repair needed.");
    }

    public int getTotalRepairCost() {
        return totalRepairCost;
    }
}