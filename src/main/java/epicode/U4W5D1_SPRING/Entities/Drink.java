package epicode.U4W5D1_SPRING.Entities;

public class Drink {
    private String name;
    private double price;
    private int calories;

    public Drink(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getCalories() { return calories; }
}
