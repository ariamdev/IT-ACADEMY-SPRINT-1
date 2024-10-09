package n3ex1.Command.Commands;

import n3ex1.Command.Classes.Airplane;
import n3ex1.Command.Classes.Bicycle;
import n3ex1.Command.Classes.Boat;
import n3ex1.Command.Classes.Car;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParkingMenu {

    static Scanner sc = new Scanner(System.in);

    public static void menu() {

        int opt;

        do {
            System.out.println("Welcome to 'Parking'. \n" +
                    "Which vehicle do you want to rent?\n" +
                    "1.Car.\n" +
                    "2.Bicycle.\n" +
                    "3.Boat.\n" +
                    "4.AirPlane.\n" +
                    "0.Exit.");
            opt = readInt();

            switch (opt) {
                case 1:carRent();
                    break;
                case 2:bicycleRent();
                    break;
                case 3:boatRent();
                    break;
                case 4:airplaneRent();
                    break;
                default: System.out.println("Please select a valid option (0-4)");
            }

        } while(opt!=0); {
            System.out.println("Hope you have a great day.");
        }
    }

    public static void carRent(){
        System.out.println("Write the brand name: ");
        String brand = sc.next();
        System.out.println("Write the model name: ");
        String model = sc.next();
        System.out.println("Write the color: ");
        String color = sc.next();

        Car car = new Car(model,brand,color);
        System.out.println("You have rented " + car.toString());

        int opt;
        do {
        System.out.println("Car commands: \n" +
                "1.Start driving. \n" +
                "2.Accelerate.\n" +
                "3.Stop.\n" +
                "0.Get out of the car\n");
        opt = readInt();
            switch (opt) {
                case 1:
                    car.start();
                    break;
                case 2:
                    car.accelerate();
                    break;
                case 3:
                    car.stop();
                    break;
            }
        }while (opt!=0);{
            System.out.println("You got out of the car");
        }
    }

    public static void bicycleRent(){
        System.out.println("Write the model name: ");
        String model = sc.next();
        System.out.println("Write the color: ");
        String color = sc.next();

        Bicycle bicycle = new Bicycle(model,color);
        System.out.println("You have rented " + bicycle.toString());

        int opt;
        do {
            System.out.println("Bicycle commands: \n" +
                    "1.Start riding.\n" +
                    "2.Accelerate.\n" +
                    "3.Stop.\n" +
                    "0.Park the bicycle.\n");
            opt = readInt();
            switch (opt) {
                case 1:
                    bicycle.start();
                    break;
                case 2:
                    bicycle.accelerate();
                    break;
                case 3:
                    bicycle.stop();
                    break;
            }
        }while (opt!=0);{
            System.out.println("You parked the bicycle.");
        }

    }

    public static void boatRent(){
        System.out.println("Write the brand name: ");
        String brand = sc.next();
        System.out.println("Write the model name: ");
        String model = sc.next();
        System.out.println("Write the color: ");
        String color = sc.next();

        Boat boat = new Boat(model,brand,color);
        System.out.println("You have rented " + boat.toString());

        int opt;
        do {
            System.out.println("Boat commands: \n" +
                    "1.Start driving.\n" +
                    "2.Accelerate.\n" +
                    "3.Stop.\n" +
                    "0.Berth ship\n");
            opt = readInt();
            switch (opt) {
                case 1:
                    boat.start();
                    break;
                case 2:
                    boat.accelerate();
                    break;
                case 3:
                    boat.stop();
                    break;
            }
        }while (opt!=0);{
            System.out.println("You berthed the boat.");
        }

    }

    public static void airplaneRent(){
        System.out.println("Write the model name: ");
        String model = sc.next();
        System.out.println("Write the manufacturer name: ");
        String manufacturer = sc.next();

        Airplane airplane = new Airplane(model,manufacturer);
        System.out.println("You have rented " + airplane.toString());

        int opt;
        do {
            System.out.println("Airplane commands: \n" +
                    "1.Start driving.\n" +
                    "2.Accelerate.\n" +
                    "3.Stop.\n" +
                    "0.Disembark plane. \n");
            opt = readInt();
            switch (opt) {
                case 1:
                    airplane.start();
                    break;
                case 2:
                    airplane.accelerate();
                    break;
                case 3:
                    airplane.stop();
                    break;
            }
        }while (opt!=0);{
            System.out.println("You have disembarked the plane. ");
        }

    }

    public static int readInt(){
        int valorInt = 0;
        boolean valid = false;

        do {
            try {
                valorInt = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("Please, introduce one number of the options.");
                sc.nextLine();
            }
        } while (!valid);
        return valorInt;
    }
}
