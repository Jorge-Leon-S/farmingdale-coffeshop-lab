package rambrew;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Beverage> drinks = new ArrayList<>();

    public void addDrink(Beverage drink) {
        drinks.add(drink);
    }

    public double getTotal() {
        return drinks.stream().mapToDouble(Beverage::getCost).sum();
    }

    public void printOrder() {
        for (Beverage drink : drinks) {
            System.out.println(drink.getDescription());
        }
        System.out.println("Total: $" + getTotal());
    }
}