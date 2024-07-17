package n2exercici1;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Yamato ", 7));
        restaurants.add(new Restaurant("Bimbap ", 9));
        restaurants.add(new Restaurant("Ramen Shifu ", 6));
        restaurants.add(new Restaurant("Yamato ", 7));
        restaurants.add(new Restaurant("Ramen Shifu ", 8));

        for(Restaurant restaurantList : restaurants){
            System.out.println(restaurantList);
        }

    }
}
