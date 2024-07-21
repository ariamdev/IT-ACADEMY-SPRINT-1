package n1exercici2;

public class OnlineEmployee extends Employee {

    private double internetFee;
    private double nightHours;

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

    public double getNightHours() {
        return this.nightHours;
    }

    public void setNightHours(double nightHours) {
        this.nightHours = nightHours;
    }

    @Override
    public String toString() {
        return "Online n1exercici1.Employee: \n" +
                "Name:" + super.getName() + " " + super.getSurname() + "\n" +
                "Monthly working hours " + super.getMonthHours() + "\n" +
                "Bonus internet fee: " + this.internetFee;
    }

    @Override
    public double calculateSalary(double monthHours) {
        double salary = (monthHours * this.getPriceHour()) + this.internetFee;
        return salary;
    }

    /*
    * @deprecated We no longer pay night bonus to online employees. Replaced by
    * {@link # calculateSalary() | @link #remove nightHours}
     */
    @Deprecated
    public double nightBonus(double monthHours, double nightHours){
        double salaryPlusNight =(monthHours * this.getPriceHour()) + this.internetFee + this.nightHours;
        return salaryPlusNight;
    }


}