package n1exercici2;

public class Main {
    @SuppressWarnings({"deprecation", "for removal"})

    public static void main(String[] args) {

        OnlineEmployee employee1 = new OnlineEmployee("Marta","Aguado", 9.5,25);
        OnsiteEmployee employee2 = new OnsiteEmployee("Cristina","Freire",15.3,120.90);

        System.out.println(employee1 + " Salary: " + employee1.calculateSalary(200));
        System.out.println(employee2 + " Salary: " + employee2.calculateSalary(160));

        System.out.println("---------------------------------------------------------------------------------------");


        employee1.nightBonus(200,50);
        employee2.dietBonus();
    }
}
