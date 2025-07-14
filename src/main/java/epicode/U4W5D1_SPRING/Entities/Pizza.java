package epicode.U4W5D1_SPRING.Entities;

import java.util.List;

public class Pizza {
    private String name;
    private double basePrice;
    private int baseCalories;
    private List<Topping> toppings;


    public Pizza(String name, double basePrice, int baseCalories, List<Topping> toppings) {
        this.name = name;
        this.basePrice = basePrice;
        this.baseCalories = baseCalories;
        this.toppings = toppings;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        double price = basePrice;
        if (toppings != null) {
            for (Topping t : toppings) price += t.getPrice();
        }
        return price;
    }

    public int getCalories() {
        int cal = baseCalories;
        if (toppings != null) {
            for (Topping t : toppings) cal += t.getCalories();
        }

        return cal;
    }

    public List<Topping> getToppings() { return toppings; }
}
