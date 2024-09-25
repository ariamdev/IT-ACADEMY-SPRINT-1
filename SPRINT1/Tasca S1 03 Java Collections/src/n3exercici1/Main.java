package n3exercici1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String file = "C:/Users/ainoa/Desktop/Programacion/Java/persona.csv";
        String line = "";

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for(String index : row){
                    System.out.printf("20s%", index);
                }
                System.out.println();

            }
        } catch(Exception e){
            e.printStackTrace();

        }
    }


}
