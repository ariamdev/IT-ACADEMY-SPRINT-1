![EN](https://img.shields.io/badge/EN-blue.svg) 4.Testing libraries
=

Learn to work with the JUnit, Hamcrest and AssertJ aseserts libraries.

:file_folder: Find all the test code in this [folder.](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test)


>**How are the activities organized?**
>
>Each theme contains 3 levels of difficulty. The higher the level, the greater the difficulty. Likewise, the same level may contain more than one exercise.


:star2: Level 1
-


#### 📍 [Exercise 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%201/n1exercici1)

Create a Java class that inserts the names of the months of the year into a sorted list.
Check with jUnit that the list has 12 positions, that it is not null and that in position 8 it contains the name 'August'.

#### 📍 [Exersice 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%201/n1exercici2)

Create a class called CalculateDni that calculates the letter of the DNI(Spanish ID) when receiving the number as a parameter.
Creates a jUnit class that verifies its correct functioning, parameterizing it so that the test receives a 
wide data spectrum and validates if the calculation is correct for 10 predefined ID numbers.

#### 📍 [Exercise 3](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%201/n1exercici3)

Create a class with a method that launches an ArrayIndexOutOfBoundsException.
Verify it with a jUnit test.

⭐🌟Level 2
-

#### 📍 [Exercise 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%202/n2exercici1)

Define a custom Matcher for Hamcrest that provides the Matcher length for a String.

We want to use the -.FeatureMatcher class.

With FeatureMatcher we can adjust an existing Matcher, decide which field of Object test should match
and provide a nice error message. FeatureMatcher constructor has the following arguments in
this command:

- The matcher we want to wrap up.
- A description of the function we try.
- A description of the possible mismatch (disadjustment).

The only method to overwrite is featureValueOf (current T), which returns the value to be passed to
match method () / matchesSafely (). Use your custom comparator in a test to check if
the "Mordor" string has a length of 8.

:star::star::star2: Level 3
-

Create Java classes and/or tests that test them to demonstrate the following:

#### 📍 [Exercise 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici1)

An assertion that shows that the value of two whole objects is the same, and another that indicates that it is not.

#### 📍 [Exercise 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici2)

An assertion that shows that the reference to an object is the same as another, and another that indicates
that's different.

#### 📍 [Exercise 3](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici3)

An assertion that two arrays of integers are identical.

#### 📍 [Exercise 4](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici4)

Creates an arrayList container of various types of objects (create them as well). Write a assertion to verify
the order of objects in the ArrayList as inserted.

- Now verify that the above list contains objects in any order.
- Verifies that, in the previous list, one of the objects has been added only once. Leave one of the items
without adding, and verify that the list does not contain the latter.

#### 📍 [Exercise 5](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici5)

Create a map and verify that contains one of the key that adds it.

#### 📍 [Exercise 6](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%203/n3exercici6)

>Find the test [here.](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici6)

Promote an ArrayIndexOutOfBoundsException in any class. Creates an assertion that validates that the exception
it's launched when it's right.

#### 📍 [Exercise 7](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici7)

Creates an empty Optional object. Write the correct assertion to verify that it is effectively empty.

---

![ES](https://img.shields.io/badge/ES-red.svg)  4.Librerias de testing
=

Aprender a trabajar con las bibliotecas de aseserts JUnit, Hamcrest y AssertJ.

:file_folder: Encuentra todo el codigo de testing en esta [carpeta.](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test)


>**Como se organizan las actividades?**
>
>Cada tema contiene 3 niveles de dificultad. A mayor nivel, mayor dificultad. Así mismo, un mismo nivel puede contener más de un ejercicio.


:star2: Nivel 1
-

#### 📍 [Ejercicio 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%201/n1exercici1)

Crea una clase Java que inserte en una lista ordenada los nombres de los meses del año.
Verifica con jUnit que la lista tiene 12 posiciones, que no es nula y que en su posición 8 contiene nombre 'agosto'.

#### 📍 [Ejercicio 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%201/n1exercici2)

Crea una clase llamada CalculoDni que calcule la letra del DNI al recibir el número como parámetro.
Crea una clase jUnit que verifique su correcto funcionamiento, 
parametrizándola para que el test reciba un espectro de datos amplio y valide si el cálculo es correcto para 10 números de DNI predefinidos.

#### 📍 [Ejercicio 3](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%201/n1exercici3)

Crea una clase con un método que lance una ArrayIndexOutOfBoundsException.
Verifica su correcto funcionamiento con un test jUnit.

⭐🌟Nivel 2
-

#### 📍 [Ejercicio 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%202/n2exercici1)

Define un Matcher personalizado para Hamcrest que proporcione el Matcher de longitud para un String.

Queremos utilizar la clase ->FeatureMatcher.

Con FeatureMatcher podemos ajustar un Matcher existente, decidir qué campo del Objeto prueba tiene que coincidir
y proporcionar un mensaje de error agradable. El constructor de FeatureMatcher tiene los siguientes argumentos en
este orden:

- El matcher que queremos envolver.
- Una descripción de la función que probamos.
- Una descripción del posible mismatch (desajuste).

El único método que tenemos que sobrescribir es featureValueOf (T actual), que devuelve el valor que se pasará al
método match () / matchesSafely (). Utiliza su comparador personalizado en una prueba para comprobar si
la cadena "Mordor" tiene una longitud de 8.

:star::star::star2: Nivel 3
-

Crea las clases Java y/o los tests que las prueban para demostrar el siguiente:

#### 📍 [Ejercicio 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici1)
Un aserto que demuestre que el valor de dos objetos enteros es igual, y otra que indique que no lo es.

#### 📍 [Ejercicio 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici2)
Un aserto que demuestre que la referencia a un objeto es la misma que otra, y otra que indique
que es diferente.

#### 📍 [Ejercicio 3](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici3)
Un aserto que indique que dos *arrays de enteros son idénticos.

#### 📍 [Ejercicio 4](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici4)

Crea un *arrayList contenedor de varios tipos de objetos (créalos también). Escribe un aserto para verificar
la orden de los objetos en el *ArrayList segundos han sido insertados.

- Ahora verifica que la lista anterior contiene los objetos en cualquier orden.
- Verifica que, en la lista anterior, uno de los objetos se ha añadido solo una vez. Deja uno de los elementos
sin añadir, y verifica que la lista no contiene este último.

#### 📍 [Ejercicio 5](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici5)
Crea un *map y verifica que contiene una de las *key que le añade.

#### 📍 [Ejercicio 6](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%203/n3exercici6)

>Encuentra su test [aquí.](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici6)

Provoca una *ArrayIndexOutOfBoundsException en una clase cualquiera. Crea un aserto que valide que la excepción
es lanzada cuando corresponde.

#### 📍 [Ejercicio 7](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici7)

Crea un objeto *Optional vacío. Escribe el aserto correcto para verificar que efectivamente está vacío.

---

![CAT](https://img.shields.io/badge/CAT-yellow.svg) 4.Llibreries de testing
=

Aprendre a treballar amb les biblioteques de aseserts JUnit, Hamcrest i AssertJ.

:file_folder: Troba tot el códi de testing en aquesta [carpeta.](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test)


>**Com s'organitzen les activitats?**
>
>Cada tema conté 3 nivells de dificultat. A major nivell, major dificultat. Així mateix, un mateix nivell pot contenir més d'un exercici.


:star2: Nivell 1
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%201/n1exercici1)


Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any.
Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'agost'.


#### 📍 [Exercici 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%201/n1exercici2)

Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un espectre de dades ampli i
validi si el càlcul és correcte per a 10 números de DNI predefinits.

#### 📍 [Exercici 3](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%201/n1exercici3)

Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
Verifica el seu correcte funcionament amb un test jUnit.

⭐🌟 Nivell 2
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%202/n2exercici1)

Defineix un Matcher personalitzat per a Hamcrest que proporcioni el Matcher de longitud per a un String.

Volem utilitzar la classe ->FeatureMatcher.

Amb FeatureMatcher podem ajustar un Matcher existent, decidir quin camp de l'Objecte prova ha de coincidir
i proporcionar un missatge d'error agradable. El constructor de FeatureMatcher té els següents arguments en
aquest ordre:

- El matcher que volem embolicar.
- Una descripció de la funció que provem.
- Una descripció del possible mismatch (desajustament).

L'únic mètode que hem de sobreescriure és featureValueOf (T actual), que retorna el valor que es passarà al
mètode match () / matchesSafely (). Utilitza el seu comparador personalitzat en una prova per a comprovar si
la cadena "Mordor" té una longitud de 8.

⭐⭐🌟Nivell 3
-

Crea les classes Java i/o els tests que les proven per a demostrar el següent:

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici1)

Una asserció que demostri que el valor de dos objectes sencers és igual, i una altra que indiqui que no ho és.

#### 📍 [Exercisi 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici2) 

Una asserció que demostri que la referència a un objecte és la mateixa que una altra, i una altra que indiqui
que és diferent.

#### 📍 [Exercici 3](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici3)

Una asserció que indiqui que dos arrays d'enters són idèntics.

#### 📍 [Exercici 4](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici4) 

Crea un arrayList contenidor de diversos tipus d'objectes (crea'ls també). Escriu una asserció per a verificar
l'ordre dels objectes en l'ArrayList segons han estat inserits.

- Ara verifica que la llista anterior conté els objectes en qualsevol ordre.
- Verifica que, en la llista anterior, un dels objectes s'ha afegit només una vegada. Deixa un dels elements
sense afegir, i verifica que la llista no conté aquest últim.

#### 📍 [Exercici 5](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici5) 
Crea un map i verifica que conté una de les key que li afegeix.

#### 📍 [Exercici 6](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Nivell%203/n3exercici6)

>Troba el seu test [aquí.](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici6)

Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol. Crea una asserció que validi que l'excepció
és llançada quan correspon.

#### 📍 [Exercici 7](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2004%20Testing/Test/Nivell%203/n3exercici7)
Crea un objecte Optional buit. Escriu l'asserció correcta per a verificar que efectivament està buit.

