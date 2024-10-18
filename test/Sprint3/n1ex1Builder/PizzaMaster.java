package n1ex1Builder;

import java.util.List;

public class PizzaMaster {
    public Pizza cookingPizza(PizzaBuilder pizzaBuilder, Size size, Dough dough, List<String> extraTopping){
        pizzaBuilder.setSize(size);
        pizzaBuilder.setDough(dough);
        extraTopping.forEach(pizzaBuilder::addToppings);
        return pizzaBuilder.build();
    }
}
