package Element;

import Visitor.ItemVisitor;

public class Armor implements Item {
    private final String name;
    private final double weight;
    private final int defense;
    private final int currentDurability;
    private final int maxDurability;

    public Armor(String name, double weight, int defense, int currentDurability, int maxDurability) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Armor name cannot be empty.");
        }
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than zero.");
        }
        if (defense <= 0) {
            throw new IllegalArgumentException("Defense must be greater than zero.");
        }
        if (currentDurability < 0 || maxDurability <= 0 || currentDurability > maxDurability) {
            throw new IllegalArgumentException("Invalid durability values.");
        }
        this.name = name;
        this.weight = weight;
        this.defense = defense;
        this.currentDurability = currentDurability;
        this.maxDurability = maxDurability;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visitArmor(this);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getDefense() {
        return defense;
    }

    public int getCurrentDurability() {
        return currentDurability;
    }

    public int getMaxDurability() {
        return maxDurability;
    }
}