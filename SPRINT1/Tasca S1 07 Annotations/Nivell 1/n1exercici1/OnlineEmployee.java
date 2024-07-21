package n1exercici1;

public class OnlineEmployee extends Employee {

    private double internetFee;

    public OnlineEmployee(String name, String surname, double priceHour, double internetFee) {
        super(name, surname, priceHour);
        this.internetFee = internetFee;
    }

    public double getInternetFee() {
        return this.internetFee;
    }

    public void setInternetFee(double internetFee) {
        this.internetFee = internetFee;
    }


    @Override
    public String toString() {
        return "Online n1exercici1.Employee: \n" +
                "Name:" + super.getName() + " " + super.getSurname() + "\n" +
                "Monthly working hours " + super.getMonthHours() + "\n" +
                "Benefit internet fee: " + this.internetFee;
    }

    @Override
    public double calculateSalary(double monthHours) {
        double salary = (monthHours * this.getPriceHour()) + this.internetFee;
        return salary;
    }
}