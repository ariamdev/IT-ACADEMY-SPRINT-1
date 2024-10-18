package n1ex1Builder;

import java.util.ArrayList;
import java.util.List;

public class MargheritaBuilder implements PizzaBuilder {
    private Size size;
    private Dough dough;
    private List<Topping> toppings = new ArrayList<>();

    public MargheritaBuilder() {
        toppings.add(new Topping("Tomato sauce"));
        toppings.add(new Topping("Mozzarella cheese"));
        toppings.add(new Topping("Basil"));
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
