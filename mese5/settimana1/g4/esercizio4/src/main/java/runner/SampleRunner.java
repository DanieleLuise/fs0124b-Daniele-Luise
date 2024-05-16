package runner;


import it.epicode.esercizio4.entities.Pizza;
import it.epicode.esercizio4.entities.Topping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import repositary.PizzaRepository;
import repositary.ToppingRepository;

public class SampleRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(SampleRunner.class);
    @Autowired
    PizzaRepository pizze;
    //@Autowired
    //DrinkRepositary drink;
    @Autowired
    ToppingRepository toppings;

    @Override
    public void run(String... args) throws Exception {
        var pizza = pizze.save(Pizza.builder().withName("margherita").build());
        toppings.save(Topping.builder().withName("salsa").withDescription("aggiungo salsa").withPizza(pizza).build());


        log.info("pizza margherita collegata al suo topping");
        pizze.findAll().forEach(p -> log.info("{}" , p.getToppings()));
    }
}
