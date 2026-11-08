package Element;

import Visitor.ItemVisitor;

public class Weapon implements Item {
    private final String name;
    private final double weight;
    private final int currentDurability;
    private final int maxDurability;

    public Weapon(String name, double weight, int currentDurability, int maxDurability) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Weapon name cannot be empty.");
        }
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than zero.");
        }
        if (currentDurability < 0 || maxDurability <= 0 || currentDurability > maxDurability) {
            throw new IllegalArgumentException("Invalid durability values.");
        }
        this.name = name;
        this.weight = weight;
        this.currentDurability = currentDurability;
        this.maxDurability = maxDurability;
    }

    @Override
    public void accept(ItemVisitor visitor) {

        visitor.visitWeapon(this);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getCurrentDurability() {
        return currentDurability;
    }

    public int getMaxDurability() {
        return maxDurability;
    }
}