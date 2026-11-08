package Element;

import Visitor.ItemVisitor;

public class Potion implements Item {
    private final String name;
    private final double weight;
    private final int healAmount;

    public Potion(String name, double weight, int healAmount) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Potion name cannot be empty.");
        }
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than zero.");
        }
        if (healAmount <= 0) {
            throw new IllegalArgumentException("Heal amount must be greater than zero.");
        }
        this.name = name;
        this.weight = weight;
        this.healAmount = healAmount;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visitPotion(this);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getHealAmount() {
        return healAmount;
    }
}