package epicode.U4W5D1_SPRING.Entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Drink> drinks, List<Topping> toppings) {
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.toppings = toppings;
    }

    public void printMenu() {
        System.out.println("----- MENU PIZZERIA -----");

        System.out.println("PIZZE:");
        for (Pizza pizza : pizzas) {
            System.out.println("- " + pizza.getName() + " | Prezzo: €" + pizza.getPrice() + " | Calorie: " + pizza.getCalories());
        }
        System.out.println("AGGIUNTE");

        for (Topping topping : toppings) {
            System.out.println("- " + topping.getName() + "| Prezzo: €" + topping.getPrice() + " | Calorie: " + topping.getCalories());
        }

        System.out.println("BEVANDE:");
        for (Drink drink : drinks) {
            System.out.println("- " + drink.getName() + " | Prezzo: €" +  drink.getPrice() + " | Calorie: " + drink.getCalories());
        }
    }
}
