⭐🌟 Level 2
-
#### [EN] 📍 Exercise 1

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

---

#### [ES] 📍 Ejercicio 1

Define un Matcher personalizado para Hamcrest que proporcione el Matcher de longitud para un String.

Queremos utilizar la clase ->FeatureMatcher.

Con FeatureMatcher podemos ajustar un Matcher existente, decidir qué campo del Objeto prueba tiene que coincidir
y proporcionar un mensaje de error agradable. El constructor de FeatureMatcher tiene los siguientes argumentos en
este orden:

- Lo matcher que queremos envolver.
- Una descripción de la función que probamos.
- Una descripción del posible mismatch (desajuste).

El único método que tenemos que sobrescribir es featureValueOf (T actual), que devuelve el valor que se pasará al
método match () / matchesSafely (). Utiliza su comparador personalizado en una prueba para comprobar si
la cadena "Mordor" tiene una longitud de 8.


---

#### [CAT] 📍 Exercici 1

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

