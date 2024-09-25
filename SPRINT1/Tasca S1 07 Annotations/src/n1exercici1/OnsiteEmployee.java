package n1exercici1;

public class OnsiteEmployee extends  Employee{

    private static double gas;

    public OnsiteEmployee(String name, String surname, double priceHour, double gas) {
        super(name, surname, priceHour);
        this.gas = gas;
    }

    public static double getGas() {
        return gas;
    }

    public static void setGas(double gas) {
        OnsiteEmployee.gas = gas;
    }

    @Override
    public String toString() {
        return "On-site n1exercici1.Employee: \n" +
                "Name:" + super.getName() + " " + super.getSurname() + "\n" +
                "Monthly working hours " + super.getMonthHours() + "\n" +
                "Benefit gas fee: " + this.gas;
    }
    @Override
    public double calculateSalary(double monthHours) {
        double salary = (monthHours * this.getPriceHour()) + this.gas;
        return salary;
    }
}
