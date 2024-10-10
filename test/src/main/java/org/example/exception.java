package org.example;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class exception {

    public static void main(String[] args) {
        try {
            int operation = 10 / 0;
            System.out.println("Result: " + operation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


