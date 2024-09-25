package n1exercici3;

public class main {
    public static void main(String[] args) {

        functInt addition = (a,b) ->  a + b;
        functInt substraction = (a,b) -> a - b;
        functInt multiply = (a,b) -> a * b;
        functInt division = (a,b) -> a / b;

        System.out.println("Addition: " + addition.operation(5,6));
        System.out.println("Substraction: " + substraction.operation(24,7));
        System.out.println("Multiply: " + multiply.operation(3,4));
        System.out.println("Division: " + division.operation(24,4));



    }
}
