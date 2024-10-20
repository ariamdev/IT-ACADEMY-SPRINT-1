[![EN](https://img.shields.io/badge/EN-blue.svg)](#eng)
[![ES](https://img.shields.io/badge/ES-red.svg)](#es)
[![CAT](https://img.shields.io/badge/CAT-yellow.svg)](#cat)

<a name="eng"></a>
6. Generics
=

Learn how to handle abstractions with Generics.

>How are the activities organized?
>
>Each theme contains 3 levels of difficulty. The higher the level, the greater the difficulty. Likewise, the same level may contain more than one exercise.


⭐ Level 1
-

#### 📍 [Exercise 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%201/n1exercici1)

Create a class called NoGenericMethods that stores three arguments of the same type, together with the methods to store and extract these objects and a constructor to initialize all three. Check that arguments can be put at any position in the constructor call.

#### 📍 [Exercise 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%201/n1exercici2)

Create a class called Person with attributes name, surname and age. 
Then create a class called GenericMethods with a generic method that accepts three generic arguments. 
This method should only print the arguments it received per screen. 
In main() of the main class, call the generic method with different types of parameters.

Example: an object of the Persona class, a String and a primitive type.

In this way you have checked that you can pass any type of parameter and in any order.

⭐🌟 Level 2
-

#### 📍 [Exercise 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%202/n2exercici1)
Modify the previous [exercise](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%201/n1exercici2) so that one of the arguments of the generic method is not generic.

#### 📍 [Exercise 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%202/n2exercici2)
Modify the [previous section](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%202/n2exercici1) so that the arguments of the generic method are a list of arguments of indefinite variable.


⭐⭐🌟 Level 3
- 

#### 📍 [Exercise 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%203)
To do this exercise you need an interface called Telephone and three classes: Smartphone, Generic and the Principal.

The Telephone interface must have a method called call(). 
The Smartphone class must implement Telephone, and in addition to the call() method, it must also have the takePhoto() method. 

The Generica class must have two generic methods, the first must receive a limited type of argument by the Telephone interface and the second must receive a limited argument by the Smartphone class. From these two methods he calls the relevant methods of Telephone and Smartphone. 
In main() of the main class, a Smartphone class object passes to the two generic Generic class methods.

---

<a name="es"></a>
6. Genéricos
=

Aprender a manejar abstracciones con Genéricos.


>¿Cómo se organizan las actividades?
>
>Cada tema contiene 3 niveles de dificultad. A mayor nivel, mayor dificultad. Así mismo, un mismo nivel puede contener más de un ejercicio.
>

🌟 Nivel 1
-

#### 📍 [Ejercicio 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%201/n1exercici1)

Crea una clase llamada NoGenericMethods que almacene tres argumentos del mismo tipo, junto con los métodos para almacenar y extraer estos objetos y un constructor para inicializar los tres. Comprueba que los argumentos se pueden poner en cualquier posición en el llamamiento al constructor.

#### 📍 [Ejercicio 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%201/n1exercici2)

Crea una clase llamada Persona con los atributos nombre, apellido y edad. 
Después crea una clase llamada GenericMethods con un método genérico que acepte tres argumentos de tipo genérico. 
Este método solo tiene que imprimir por pantalla los argumentos que ha recibido.
Al main() de la clase principal, llamamiento el método genérico con diferentes tipos de parámetros.

Ejemplo: un objeto de la clase Persona, un String y un tipo primitivo.


⭐🌟 Nivel 2
-

#### 📍 [Ejercicio 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%202/n2exercici1)

Modifica el [ejercicio anterior](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%201/n1exercici2) de forma que uno de los argumentos del método genérico no sea genérico.

#### 📍 [Ejercicio 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%202/n2exercici2)
Modifica el [apartado anterior](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%202/n2exercici1) de forma que los argumentos del método genérico sean una lista de argumentos de variable indefinida.

⭐⭐🌟 Nivel 3
-

#### 📍 [Ejercicio 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%203)

Para hacer este ejercicio necesitas una interfaz llamada Telefono y tres clases: Smartphone, Generica y la Principal.

La interfaz Telefono tiene que tener un método denominado llamar(). 
La clase Smartphone tiene que implementar Telefono, y además del método llamar(), también tiene que tener el método hacerFotos(). 

La clase Generica tiene que tener dos métodos genéricos, el primero tiene que recibir un tipo de argumento limitado por la interfaz Telefon oy el segundo tiene que recibir un argumento limitado por la clase *Smartphone. Desde estos dos métodos grita los métodos pertinentes de *Telefon y *Smartphone. En el *main() de la clase Principal, pasa un objeto de la clase *Smartphone a los dos métodos genéricos de la clase *Generica.

El método limitado por la interfaz Telefono, de la clase Generica, puede llamar al método hacerFotos()?

---

<a name="cat"></a>
6. Genèrics
=

Aprendre a manejar abstraccions amb Genèrics.

>Com s'organitzen les activitats?
>
>Cada tema conté 3 nivells de dificultat. A major nivell, major dificultat. Així mateix, un mateix nivell pot contenir més d'un exercici.


🌟Nivell 1
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%201/n1exercici1)

Crea una classe anomenada NoGenericMethods que emmagatzemi tres arguments del mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres. Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.

#### 📍 [Exercici 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%201/n1exercici2)
Crea una classe anomenada Persona amb els atributs nom, cognom i edat. 
Després crea una classe anomenada GenericMethods amb un mètode genèric que accepti tres arguments de tipus genèric. 
Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe principal, crida el mètode genèric amb diferents tipus de paràmetres.

Exemple: un objecte de la classe Persona, un String i un tipus primitiu.

D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre.


⭐🌟 Nivell 2
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%202/n2exercici1)
Modifica [l'exercici anterior](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%201/n1exercici2) de manera que un dels arguments del mètode genèric no sigui genèric.

#### 📍 [Exercici 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%202/n2exercici2)
Modifica [l'apartat anterior](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%202/n2exercici1) de manera que els arguments del mètode genèric siguin una llista d'arguments de variable indefinida.


⭐⭐🌟 Nivell 3
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2006%20Generics/Nivell%203)
Per fer aquest exercici necessites una interfície anomenada Telefon i tres classes: Smartphone, Generica i la Principal.

La interfície Telefon ha de tenir un mètode anomenat trucar(). 
La classe Smartphone ha d’implementar Telefon, i a més del mètode trucar(), també ha de tenir el mètode ferFotos(). 

La classe Generica ha de tenir dos mètodes genèrics, el primer ha de rebre un tipus d’argument limitat per la interfície Telefon i el segon ha de rebre un argument limitat per la classe Smartphone. Des d’aquests dos mètodes crida els mètodes pertinents de Telefon i Smartphone. En el main() de la classe Principal, passa un objecte de la classe Smartphone als dos mètodes genèrics de la classe Generica.

El mètode limitat per la interfície Telefon, de la classe Generica, pot cridar al mètode ferFotos()?

