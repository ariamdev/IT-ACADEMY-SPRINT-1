package deliverybrumm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class deliveryBrumm {

    static Scanner sc = new Scanner(System.in);
    static  ArrayList<products> productos = new ArrayList<>();
    static  ArrayList<deliveryman> repartidores = new ArrayList<>();

    public static void startProgram() {
        int opt = 0;

        do{
            System.out.println("DELIVERY BRUMM MENÚ: \n" +
                    "1. Crear un nuevo pedido \n" +
                    "2. Marcar un pedido como entregado. \n" +
                    "3. Listar los pedidos pendientes \n" +
                    "4. Listar los pedidos entregados. \n" +
                    "0. Salir del programa");
            opt = sc.nextInt();

            switch (opt){
                case 1: crearPedido();
                    break;
                case 2: //Coger clase pedido y poner un boolean de entregado. Mismo sistema que repartidor();
                    break;
                case 3: //Hacer listado de pedidos.
                    break;
                case 4:// Listado pedidos entregados. (Hacer toList().)
                    break;
            }
        }while(opt ==0); {
            System.out.println("Hasta luego");

        }
    }

    public static deliveryman repartidor() {

        deliveryman d1 = new deliveryman("Pedro", transport.BIKE);
        deliveryman d2 = new deliveryman("Carla", transport.MOTO);
        deliveryman d3 = new deliveryman("Eric", transport.WALK);


        repartidores.add(d1);
        repartidores.add(d2);
        repartidores.add(d3);


        //Hacemos un filtro de las personas disponibles y lo añadimos a la lista repdispo
        List repdispo = repartidores.stream().filter(deliveryman::isDisponibility).toList();


        deliveryman deliveryperson = null;
        if (repdispo.isEmpty()) {
            System.out.println("Oops! No hay repartidores disponibles en este momento.");
        } else { //Hacemos random en el index de la lista para coger un repartidor
            int index = new Random().nextInt(repdispo.size());
            deliveryperson = (deliveryman) repdispo.get(index);
            //System.out.println(deliveryperson.toString());
            ((deliveryman) repdispo.get(index)).setDisponibility(false);//Añadimos disponibilidad false a ese repartidor.
        }

        return deliveryperson;
    }


    public static void crearPedido(){

        //Asinar repartidor!

        System.out.println("Indique el nombre del cliente: ");
        String name = sc.next();
        System.out.println("Indique la dirección: ");
        String adress = sc.next();
        sc.next();
        cliente cl1 = new cliente(name,adress);

        System.out.println("Indique el producto: (BURRITO/HAMBURGESA/KEBAB/PIZZA");
        String nameProduct = sc.next();

        Burrito burrito = new Burrito("Burrito",6.5);
        Hamburger hamburgesa = new Hamburger("Hamburger",8.9);
        Kebab kebab = new Kebab("Kebab",4.5);
        Pizza pizza = new Pizza("Pizza",7.9);

        if (nameProduct.equalsIgnoreCase("BURRITO")){
            productos.add(burrito);
            System.out.println("¡Te regalamos un pin con tu burrito!");
        } else if (nameProduct.equalsIgnoreCase("HAMBURGESA")){
            productos.add(hamburgesa);
            System.out.println("¡Te regalamos una gorra con tu hamburguesa!");
        } else if(nameProduct.equalsIgnoreCase("KEBAB")){
            productos.add(kebab);
        } else if (nameProduct.equalsIgnoreCase("PIZZA")) {
            productos.add(pizza);
        }

        try {
            pedido p1 = new pedido(cl1, productos, repartidor());
            deliveryman rep = repartidor();
            p1.setDeliveryman(rep);
            System.out.println("Pedido generado correctamente: " + p1.toString());
        } catch (Exception e){
            System.out.println("Error. No se ha podido generar el pedido.");
        }

    }

}
