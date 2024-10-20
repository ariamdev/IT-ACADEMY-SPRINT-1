[![EN](https://img.shields.io/badge/EN-blue.svg)](#eng)
[![ES](https://img.shields.io/badge/ES-red.svg)](#es)
[![CAT](https://img.shields.io/badge/CAT-yellow.svg)](#cat)

<a name="eng"></a>
7. Annotations
=

To know how annotations work in Java.

>How are the activities organized?
>
>Each theme contains 3 levels of difficulty. The higher the level, the greater the difficulty. Likewise, the same level may contain more than one exercise.

🌟 Level 1
-

#### 📍 [Exercise 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%201/n1exercici1)

Creates a hierarchy of objects with three classes: Worker, Online Worker and On Site Worker.

The working class has the attributes name, surname, price/time, and the method of calculateSalary() 
that receives by parameter the number of hours worked and multiplies it by price/time. Child classes must overwrite it, using @Override. 

From main() of the main class, make the necessary invocations to demonstrate the operation of the @Override annotation.

In On Site workers, the method to calculate their salary will receive by parameter the number of hours worked per month.
When calculating the salary, the number of hours worked by the price/time will be multiplied, plus the value of a static attribute called 
gasoline that we will add in this class.

In online workers, the method to calculate their salary will receive by parameter the number of hours worked per month. When calculating the salary,
the number of hours worked by the price/hour will be multiplied and the price of the flat rate of the Internet will be added, which will be a 
constant of the working class Online.

#### 📍 [Exercise 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%201/n1exercici2)

Adds to child classes some obsolete (deprecated) methods, and uses the corresponding annotation. 
Invoke obsolete methods from an external class, by removing warnings by corresponding annotation to be obsolete.

⭐🌟 Level 2
-

#### 📍 [Exercise 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%202/n2exercici1)

Creates a custom annotation that should allow a Java object to be serialized in a JSON file. 
The annotation must receive the directory where the resulting file will be placed.


⭐⭐🌟 Level 3
-

#### 📍 [Exercise 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%203/n3exercici1)

Adds the possibility that the annotation created at the [previous level](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%202/n2exercici1) is registered by the Virtual Machine at run time. 
Shows that annotation reading is running using Java Reflection.

---

<a name="es"></a>
7. Annotations 
=

Conocer como funcionan las annotations en Java.

>¿Cómo se organizan las actividades?
>
>Cada tema contiene 3 niveles de dificultad. A mayor nivel, mayor dificultad. Así mismo, un mismo nivel puede contener más de un ejercicio.

⭐ Nivel 1
-

#### 📍 [Ejercicio 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%201/n1exercici1)

Crea una jerarquía de objetos con tres clases: Trabajador, TrabajadorOnline y TrabajadorPresencial.

La clase Trabajador tiene los atributos nombre, apellido, precio/hora, y el método calcularSueldo() que recibe por parámetro el número de horas trabajadas y lo multiplica por el precio/hora. 
Las clases hijas lo tienen que sobrescribir, empleando @override. 

Desde el main() de la clase Principal, haz las invocaciones necesarias para demostrar el funcionamiento de la anotación @override.

En los trabajadores presenciales, el método para calcular su sueldo, recibirá por parámetro el número de horas trabajadas en el mes.
En la hora de calcular el sueldo se multiplicará el número de horas trabajadas por el precio/hora, más el valor de un atributo static denominado 
gasolina que añadiremos en esta clase.

En los trabajadores en línea, el método para calcular su sueldo recibirá por parámetro el número de horas trabajadas en el mes. 
En la hora de calcular el sueldo se multiplicará el número de horas trabajadas por el precio/hora y se le sumará el precio de la tarifa plana de Internet, 
que será una constante de la clase TrebajadorOnline.

#### 📍 [Ejercicio 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%201/n1exercici2)

Añade en las clases hijas algunos métodos obsoletos (deprecated), y utiliza la anotación correspondiente.
Invoca desde una clase externa los métodos obsoletos, suprimiendo mediante la anotación correspondiendo los “warnings” para ser obsoletos.

⭐🌟 Nivel 2
-

#### 📍 [Ejercicio 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%202/n2exercici1)

Crea una anotación personalizada que tiene que permitir serializar un objeto Java en un fichero JSON. 
La anotación tiene que recibir el directorio donde se colocará el fichero resultante.

⭐⭐🌟 Nivel 3
-

#### 📍 [Ejercicio 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%203/n3exercici1)

Añade la posibilidad que la anotación creada en el [nivel anterior](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%202/n2exercici1) sea registrada por la Virtual Machine en tiempo de ejecución. 
Demuestra que se ejecuta la lectura de la annotation usando Java Reflection.

---

<a name="cat"></a>
7. Annotations
=

Conèixer com funcionen les annotations a Java.

>Com s'organitzen les activitats?
>
>Cada tema conté 3 nivells de dificultat. A major nivell, major dificultat. Així mateix, un mateix nivell pot contenir més d'un exercici.


🌟 Nivell 1
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%201/n1exercici1)

Crea una jerarquia d’objectes amb tres classes:  Treballador, TreballadorOnline i TreballadorPresencial.

La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per paràmetre el nombre d'hores 
treballades i el multiplica pel preu/hora. Les classes filles l'han de sobreescriure,  emprant @Override. 

Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de l’anotació @Override.

En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores treballades al mes.
A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel preu/hora, més el valor d'un atribut static anomenat 
benzina que afegirem en aquesta classe.

En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes.
A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa plana d'Internet, 
que serà una constant de la classe TreballadorOnline.

#### 📍 [Exercici 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%201/n1exercici2)

Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. Invoca des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per ser obsolets.


⭐🌟 Nivell 2
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%202/n2exercici1)
Crea una anotació personalitzada que ha de permetre serialitzar un objecte Java en un fitxer JSON. 
L’anotació ha de rebre el directori on es col·locarà el fitxer resultant.

⭐⭐🌟 Nivell 3
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%203/n3exercici1)

Afegeix la possibilitat que l'anotació creada en el [nivell anterior](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2007%20Annotations/Nivell%202/n2exercici1) sigui registrada per la Virtual Machine en temps d'execució.
Demostra que s'executa la lectura de l'annotation fent servir Java Reflection.

