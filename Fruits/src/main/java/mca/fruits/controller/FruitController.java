package mca.fruits.controller;

import mca.fruits.model.Fruit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class FruitController {

    @GetMapping("/fruits")
    public List<Fruit> getFruits() {
        List<Fruit> fruitList = new ArrayList<>();
        Fruit apple = new Fruit("Apple", true, 14.5, "N/A", "Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus.The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today.");
        Fruit tomato = new Fruit("Tomato", true, 30.5, "150", "The species originated in western South America and Central America.The Nahuatl (the language used by the Aztecs) word tomatl gave rise to the Spanish word tomate, from which the English word tomato derived.");
        Fruit banana = new Fruit("Banana", false, 22.0, "N/A", "A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa.  In some countries, bananas used for cooking may be called plantains, distinguishing them from dessert bananas.");
        fruitList.add(apple);
        fruitList.add(tomato);
        fruitList.add(banana);
        return fruitList;
    }
}