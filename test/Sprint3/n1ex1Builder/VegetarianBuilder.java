package n1ex1Builder;

import java.util.ArrayList;
import java.util.List;

public class VegetarianBuilder implements PizzaBuilder {
    private Size size;
    private Dough dough;
    private List<Topping> toppings = new ArrayList<>();

    public VegetarianBuilder() {
        toppings.add(new Topping("Tomato sauce"));
        toppings.add(new Topping("VeggiCheese"));
        toppings.add(new Topping("Mushrooms"));
        toppings.add(new Topping("Onion"));
        toppings.add(new Topping("Black Olives"));
        toppings.add(new Topping("Green pepper"));
        toppings.add(new Topping("Tomato"));
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
