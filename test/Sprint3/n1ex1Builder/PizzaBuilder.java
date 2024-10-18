package n1ex1Builder;

public interface PizzaBuilder {
    public void setSize(Size size);
    public void setDough(Dough dough);
    public void addToppings(String toppings);
    Pizza build();
}
