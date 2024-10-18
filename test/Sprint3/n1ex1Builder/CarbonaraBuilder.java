package n1ex1Builder;

import java.util.ArrayList;
import java.util.List;

public class CarbonaraBuilder implements PizzaBuilder {
    private Size size;
    private Dough dough;
    private List<Topping> toppings = new ArrayList<>();

    public CarbonaraBuilder() {
        toppings.add(new Topping("Bacon"));
        toppings.add(new Topping("Mushrooms"));
        toppings.add(new Topping("Carbonara Sauce"));
        toppings.add(new Topping("Cheese"));
        toppings.add(new Topping("Onion"));
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    @Override
    public void addToppings(String topping) {
        toppings.add(new Topping(topping));
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, toppings);
    }
}
