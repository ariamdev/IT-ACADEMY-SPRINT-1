[![EN](https://img.shields.io/badge/EN-blue.svg)](#eng)
[![ES](https://img.shields.io/badge/ES-red.svg)](#es)
[![CAT](https://img.shields.io/badge/CAT-yellow.svg)](#cat)


<a name="eng"></a>
**2. Exceptions**
=

How to handle Exceptions to build robust code.


>**How are the activities organized?**
>
>Each theme contains 3 levels of difficulty. The higher the level, the greater the difficulty. Likewise, the same level may contain more than one exercise.


:star2: Level 1
-

#### 📍 [Exercise 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2002%20Exceptions/n1exercici1)

Create a class called "Product" with the attributes name and price, and another class called "Sell". 
This class has as attributes a collection of products and the total price of the sale.

The "Selling" class has a method called calculatetotal() that launches the custom exception "NullSellException" and shows on screen "To make a sale you must first add products" if the product collection is empty. 
If the collection has products, then you must run the collection and save the sum of all the prices of the products at the total price attribute of the sale.

The custom exception "NullSellException" must be the daughter of the Exception class.
To your builder we have to pass the message “To make a sale you first have to add products” and when we capture the exception, we have to show it on screen with the getMessage() method of the exception.

Writes the code needed to generate and capture an exception of type "IndexOutOfBoundsException".


⭐🌟 Level 2
-

#### 📍 [Exercise 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2002%20Exceptions/n2exercici1)


Create a class called "Entry". 
This class should be used to control the different exceptions that may appear in Java when entering data by keyboard using the Scanner class.

The first thing to do is to instantiate an object of the Scanner class and from there, create static methods to read the different data types from the keyboard.

All methods receive a String with the message to be displayed to the user, for example: “Introduce your age”, and return the appropriate data introduced by the user in each method, for example: a byte with the age of the user.

Methods to be implemented by capturing the exception of the class "InputMismatchException":

~~~
public static byte readByte(String message);
public static int readInt(String message);
public static float readFloat(String message);
public static double readDouble(String message);
~~~

Methods to be implemented by capturing a custom exception of the Exception class:

~~~
public static char readrChar(String message);
public static String readString(String message);
public static boolean readYesNo(String message), if the user enters "yes", returns "true", if the user enters "n", returns "false".
~~~


<a name="es"></a>
**2. Excepciones**
=

Aprender a manejar las Exceptions para construir código robusto.


>**Como se organizan las actividades?**
>
>Cada tema contiene 3 niveles de dificultad. A mayor nivel, mayor dificultad. Así mismo, un mismo nivel puede contener más de un ejercicio.


:star2: Nivel 1
-

#### 📍 [Ejercicio 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2002%20Exceptions/n1exercici1)

Crea una clase llamada "Producto" con los atributos nombre y precio, y otra clase llamada "Venta". Esta clase tiene como atributos una colección de productos y el precio total de la venta.

La clase "Venta", tiene un método llamado *calcularTotal() que lanza la excepción personalizada "VendaBuidaException" y muestra por pantalla “Para hacer una venta primero tienes que añadir productos” si la colección de productos está vacía.
Si la colección tiene productos, entonces tiene que recorrer la colección y guardar la suma de todos los precios de los productos al atributo precio total de la venta.

La excepción personalizada Venta Vacía Exception tiene que ser hija de la clase Exception. 
A su constructor le tenemos que pasar el mensaje “Para hacer una venta primero tienes que añadir productos” y cuando capturamos la excepción, lo tenemos que mostrar por pantalla con el método getMessage() de la excepción.

Escribe el código necesario para generar y capturar una excepción de tipo "IndexOutOfBoundsException".


⭐🌟 Nivel 2
-

#### 📍 [Ejercicio 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2002%20Exceptions/n2exercici1)

Crea una clase llamada "Entrada". 
Esta clase tiene que servir para controlar las diferentes excepciones que pueden aparecer en Java en la hora de introducir datos por teclado utilizando la clase Scanner.

El primero que se tiene que hacer es *instanciar un objeto de la clase *Scanner y a partir de aquí, crear métodos estáticos para leer los diferentes tipos de datos desde el teclado. 

Todos los métodos reciben un String con el mensaje que se quiere mostrar al usuario/aria, por ejemplo: “Introduce tu edad”, y devuelven el dato oportuno introducido por el usuario/aria en cada método, por ejemplo: un byte con la edad del usuario/aria.

Métodos a implantar capturando la excepción de la clase "InputMismatchException":

~~~
public static byte leerByte(String mensaje);
public static int leerInt(String mensaje);
public static float leerFloat(String mensaje);
public static double leerDouble(String mensaje);
~~~


Métodos a implantar capturando una excepción personalizada de la clase Exception:

~~~
public static char leerrChar(String missatge);
public static String leerString(String missatge);
public static boolean leerSiNo(String missatge),si el usuario/aria introduce “s”, devuelve “true”, si el usuario/aria introduce “n”, devuelve “false”.
~~~

<a name="cat"></a>
**2. Excepcions**
=

Aprendre a manejar les Exceptions per a construir codi robust.


>**Com s'organitzen les activitats?**
>
>Cada tema conté 3 nivells de dificultat. A major nivell, major dificultat. Així mateix, un mateix nivell pot contenir més d'un exercici.


:star2: Nivell 1
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2002%20Exceptions/n1exercici1)

Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda". Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.

La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada "VendaBuidaException" i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.

L’excepció personalitzada "VendaBuidaException" ha de ser filla de la classe Exception. Al seu constructor li hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.

Escriu el codi necessari per a generar i capturar una excepció de tipus "IndexOutOfBoundsException".


⭐🌟 Nivell 2
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2002%20Exceptions/n2exercici1)

Crea una classe anomenada "Entrada". 
Aquesta classe ha de servir per controlar les diferents excepcions que poden aparèixer en Java a l’hora d’introduir dades per teclat utilitzant la classe Scanner.

El primer que s’ha de fer és instanciar un objecte de la classe Scanner i a partir d’aquí, crear mètodes estàtics per llegir els diferents tipus de dades des del teclat. 

Tots els mètodes reben un String amb el missatge que es vol mostrar a l’usuari/ària, per exemple: “Introdueix la teva edat”, i retornen la dada oportuna introduïda per l’usuari/ària en cada mètode, per exemple: un byte amb l’edat de l’usuari/ària.

Mètodes a implantar capturant l’excepció de la classe "InputMismatchException":

~~~
public static byte llegirByte(String missatge);
public static int llegirInt(String missatge);
public static float llegirFloat(String missatge);
public static double llegirDouble(String missatge);
~~~

Mètodes a implantar capturant una excepció personalitzada de la classe Exception:

~~~
public static char llegirChar(String missatge);
public static String llegirString(String missatge);
public static boolean llegirSiNo(String missatge), si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari/ària introdueix “n”, retorna “false”.
~~~
