
⭐🌟 Level 2
-

#### [EN] 📍 Exercise 1


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

---

#### [ES] 📍 Ejercicio 1

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

---

#### [CAT] 📍 Exercici 1

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
