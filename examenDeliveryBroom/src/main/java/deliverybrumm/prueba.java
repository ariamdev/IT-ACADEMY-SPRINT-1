package deliverybrumm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class prueba {
    public static void main(String[] args) {

        deliveryman d1 = new deliveryman("Pedro",transport.BIKE);
        deliveryman d2 = new deliveryman("Carla", transport.MOTO);
        deliveryman d3 = new deliveryman("Eric", transport.WALK);

        ArrayList<deliveryman> repartidores = new ArrayList<>();
        repartidores.add(d1);
        repartidores.add(d2);
        repartidores.add(d3);

        System.out.println(d1.isDisponibility());

        //Hacemos un filtro de las personas disponibles y lo añadimos a la lista repdispo
        List repdispo = repartidores.stream().filter(deliveryman::isDisponibility).toList();


        if(repdispo.isEmpty()){
            System.out.println("Oops! No hay repartidores disponibles en este momento.");
        } else { //Hacemos random en el index de la lista para coger un repartidor
            int index = new Random().nextInt(repdispo.size());
            deliveryman deliveryperson = (deliveryman) repdispo.get(index);
            System.out.println(deliveryperson.toString());
            ((deliveryman) repdispo.get(index)).setDisponibility(false);//Añadimos disponibilidad false a ese repartidor.
            System.out.println(deliveryperson.isDisponibility());
        }

    }
}
