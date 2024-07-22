package n1exercici5;

public class Main {
    public static void main(String[] args) {
        functionalInterface numberPi = () -> 3.1415;
        System.out.println(numberPi.getPiValue());
    }
}
