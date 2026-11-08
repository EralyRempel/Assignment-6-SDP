# Assignment 6: Visitor Design Pattern (RPG Inventory System)

##  Description
This project demonstrates the implementation of the **Visitor Behavioral Design Pattern** in Java. 
The chosen domain is an **RPG Equipment &amp; Inventory System**, where a character holds various item types (`Weapon`, `Armor`, `Potion`) and needs to execute multiple operations over them (e.g., total weight calculation and durability diagnostics/repair estimation) without coupling operational logic to the element classes.

---

##  Architecture &amp; Double Dispatch Mechanism
- **Element Interface (`Item`)**: Defines the `accept(ItemVisitor visitor)` method.
- **Concrete Elements**:
  - `Weapon`: Represents weapons with weight and durability attributes.
  - `Armor`: Represents defensive equipment with defense stats and durability.
  - `Potion`: Consumable items with heal values (no durability stats).
- **Visitor Interface (`ItemVisitor`)**: Declares overload methods (`visitWeapon`, `visitArmor`, `visitPotion`).
- **Concrete Visitors**:
  - `WeightCalculatorVisitor`: Calculates the total weight of all inventory items.
  - `DurabilityCheckVisitor`: Inspects equipment durability and calculates repair costs.
- **Client (`Main`)**: Iterates through a heterogeneous `List
