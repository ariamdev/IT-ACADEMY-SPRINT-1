package n1exercici3;

public class Main {

    public void mainError() {

        int[] arrayTest = {1, 2, 3};
        try {
            System.out.println(arrayTest[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds: " + e.getMessage());
        }
    }
}
