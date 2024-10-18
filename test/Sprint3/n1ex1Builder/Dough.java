package n1ex1Builder;

public enum Dough {
    THIN("thin"),
    CLASSIC("classic"),
    DOUBLE("double");

    private String name;

    Dough(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
