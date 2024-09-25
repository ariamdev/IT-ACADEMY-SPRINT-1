package n1exercici2;

public class OnsiteEmployee extends Employee {

    private double gas;
    private double dietBonus;

    public OnsiteEmployee(String name, String surname, double priceHour, double gas) {
        super(name, surname, priceHour);
        this.gas = gas;
    }

    public double getGas() {
        return this.gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getDietBonus() {
        return this.dietBonus;
    }

    public void setDietBonus(double dietBonus) {
        this.dietBonus = dietBonus;
    }

    @Override
    public String toString() {
        return "On-site n1exercici1.Employee: \n" +
                "Name:" + super.getName() + " " + super.getSurname() + "\n" +
                "Monthly working hours " + super.getMonthHours() + "\n" +
                "Bonus gas fee: " + this.gas;
    }
    @Override
    public double calculateSalary(double monthHours) {
        double salary = (monthHours * this.getPriceHour()) + this.gas;
        return salary;
    }

    @Deprecated (forRemoval = false)
    public void dietBonus(){
        System.out.println("We no longer pay diet bonus to on-site employee");
    }
}
