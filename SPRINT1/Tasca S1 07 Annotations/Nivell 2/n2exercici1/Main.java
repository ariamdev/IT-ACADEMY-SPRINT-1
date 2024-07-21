package n2exercici1;

import com.google.gson.Gson;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Persona persona1 = new Persona("Eric", 34);
        Gson gson = new Gson();
        String directory = persona1.getClass().getAnnotation(SerializableAnnotation.class).directory();

    if(persona1.getClass().isAnnotationPresent(SerializableAnnotation.class) || !directory.isEmpty()) {
        try (FileWriter fileWriter = new FileWriter(directory + "personaData.json")) {
            String jsonPersona = gson.toJson(persona1);
            fileWriter.write(jsonPersona);
            fileWriter.close();
            System.out.println("The JSON file has been successfully created.");
        } catch (IOException e) {
            System.out.println("Error. The JSON file could not be created: " + e.getMessage());
        }
    } else {
        System.out.println("There isn't an 'Serializable Annotation' in the object. Unable to create JSON file.");
    }

    }
}
