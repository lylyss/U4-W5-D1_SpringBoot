package epicode.U4W5D1_SPRING;

import epicode.U4W5D1_SPRING.Entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Config {


    //Toppings----------------
    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 1.0, 80);
    }
    @Bean
    public Topping salame() {
        return new Topping("Salame", 0.9, 70);
    }
    @Bean
    public Topping peperoni() {
        return new Topping("Peperoni", 0.5, 60);
    }
    @Bean
    public Topping olive() {
        return new Topping("Olive", 0.5, 40);
    }
    @Bean
    public Topping carciofi() {
        return new Topping("Carciofi", 1, 50);
    }
    @Bean
    public Topping tonno() {
        return new Topping("Tonno", 1.2, 90);
    }
    @Bean
    public Topping cipolla() {
        return new Topping("Cipolla", 0.5, 20);
    }
    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 100, 50);
    }

    @Bean
    public Topping funghi() {
        return new Topping("Funghi", 0.7, 30);
    }

    // Pizze---------------------
    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 6.0, 650, List.of());
    }
    @Bean
    public Pizza hawaiianPizza(Topping prosciutto, Topping ananas) {
        return new Pizza("Hawaiian Pizza", 6.0, 600, Arrays.asList(prosciutto, ananas));
    }
    @Bean Pizza capricciosa(Topping prosciutto, Topping funghi) {
        return new Pizza("Capricciosa", 6.0, 700, Arrays.asList(prosciutto, funghi));
    }
    @Bean Pizza quattroStagioni(Topping prosciutto, Topping funghi, Topping carciofi) {
        return new Pizza("Quattro Stagioni", 6.0, 750, Arrays.asList(prosciutto, funghi, carciofi));
    }
    @Bean Pizza diavola(Topping salame, Topping peperoni) {
        return new Pizza("Diavola", 6.0, 800, Arrays.asList(salame, peperoni));
    }

    // Bevande--------------------
    @Bean
    public Drink cola() {
        return new Drink("Cola", 2.0, 100);
    }

    @Bean
    public Drink sprite() {
        return new Drink("Sprite", 2.50, 120);
    }
    @Bean Drink fanta() {
        return new Drink("Fanta", 2.50, 110);
    }

    @Bean
    public Drink acqua() {
        return new Drink("Acqua", 1.50, 0);
    }
    @Bean
    public Drink birra() {
        return new Drink("Birra", 5.0, 300);
    }
    @Bean
    public Drink vino() {
        return new Drink("Vino", 6.0, 250);
    }
    @Bean
    public Menu menu(Pizza margherita, Pizza hawaiianPizza, Pizza capricciosa, Pizza quattroStagioni, Pizza diavola,
                     Drink cola, Drink sprite, Drink fanta, Drink acqua, Drink birra, Drink vino) {
        List<Pizza> pizzas = List.of(margherita, hawaiianPizza, capricciosa, quattroStagioni, diavola);
        List<Drink> drinks = List.of(cola, sprite, fanta, acqua, birra, vino);
        return new Menu(pizzas, drinks);
    }
}
