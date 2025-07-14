package epicode.U4W5D1_SPRING.Entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.drinks = drinks;
    }

    public void printMenu() {
        System.out.println("----- MENU PIZZERIA -----");

        System.out.println("PIZZE:");
        for (Pizza pizza : pizzas) {
            System.out.println("- " + pizza.getName() + " | Prezzo: €" + pizza.getPrice() + " | Calorie: " + pizza.getCalories());
        }


        System.out.println("BEVANDE:");
        for (Drink drink : drinks) {
            System.out.println("- " + drink.getName() + " | Prezzo: €" +  drink.getPrice() + " | Calorie: " + drink.getCalories());
        }
    }
}
