import Element.Armor;
import Element.Item;
import Element.Potion;
import Element.Weapon;
import Visitor.DurabilityCheckVisitor;
import Visitor.WeightCalculatorVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> inventory = new ArrayList<>();
        inventory.add(new Weapon("Iron Sword", 4.5, 70, 100));
        inventory.add(new Armor("Steel Chestplate", 15.0, 50, 40, 100));
        inventory.add(new Potion("Health Potion", 0.5, 50));

        System.out.println("=== Weight Calculation ===");
        WeightCalculatorVisitor weightVisitor = new WeightCalculatorVisitor();
        for (Item item : inventory) {
            item.accept(weightVisitor);
        }
        System.out.println("Total Inventory Weight: " + weightVisitor.getTotalWeight() + " kg\n");

        System.out.println("=== Durability & Repair Check ===");
        DurabilityCheckVisitor durabilityVisitor = new DurabilityCheckVisitor();
        for (Item item : inventory) {
            item.accept(durabilityVisitor);
        }
        System.out.println("Total Repair Cost: " + durabilityVisitor.getTotalRepairCost() + " gold.");
    }
}