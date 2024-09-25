package n3exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<student> studentList = new ArrayList<>();
        studentList.add(new student("Ainoa",30,"Java", 7.8));
        studentList.add(new student("Ana",27,"Big Data",8.5));
        studentList.add(new student("Eric",35,"JavaScript",6.5));
        studentList.add(new student("Marta",37,"PHP",9.0));
        studentList.add(new student("Albert",17,"Java",9.0));


        studentList.forEach(a -> System.out.println("Name: " + a.getName() + " Course: " + a.getCourse()));

        System.out.println("-----------------------------------------------------------------------------");

        studentList.stream().filter(a -> a.getName().startsWith("a") ||
                a.getName().startsWith("A")).toList().forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------");

        studentList.stream().filter(a -> (a.getQualification() >= 5)).forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------");

        studentList.stream().filter(a -> (a.getQualification() >= 5) &&
                (!a.getCourse().equalsIgnoreCase("PHP"))).forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------");

        studentList.stream().filter(a -> (a.getAge() >= 18) &&
                (a.getCourse().equalsIgnoreCase("Java"))).forEach(System.out::println);


    }
}
