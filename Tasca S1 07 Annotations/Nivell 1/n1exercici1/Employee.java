package n1exercici1;

public abstract class Employee {

    private String name;
    private String surname;
    private double priceHour;
    private double monthHours;

    public Employee(String name, String surname, double priceHour) {
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getMonthHours(){
        return this.monthHours;
    }

    public double getPriceHour() {
        return this.priceHour;
    }

    public void setPrice(double priceHour) {
        this.priceHour = priceHour;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " " + this.surname + "Monthly working hours " + this.monthHours;
    }

    public abstract double calculateSalary(double monthHours);
}

