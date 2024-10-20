

**1. Herència i Polimorfisme:** 
=

Principis fonamentals de POO.


>**Com s'organitzen les activitats?**
>
>Cada tema conté 3 nivells de dificultat. A major nivell, major dificultat. Així mateix, un mateix nivell pot contenir més d'un exercici.


:star2: Nivell 1
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2001%20Her%C3%A8ncia%20i%20Polimorfism/n1exercici1)

En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha instruments de vent, de corda i de percussió.

Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més, tenen un mètode anomenat tocar(). 
Aquest, és abstracte a la classe instrument i, per tant, s’ha d’implementar a les classes filles. 
Si s’està tocant un instrument de vent, el mètode ha de mostrar per consola: "Està sonant un instrument de vent", si s’està tocant un instrument de corda: “Està sonant un instrument de corda” i si s’està tocant un instrument de percussió: “Està sonant un instrument de percussió”.
El procés de càrrega d'una classe només té lloc una vegada. 

Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta. 

#### 📍 [Exercici 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2001%20Her%C3%A8ncia%20i%20Polimorfism/n1exercici2)

Crea una classe "Cotxe" amb els atributs: marca, model i potència. La marca ha de ser estàtic final, el model estàtic i la potència final. Demostra la diferència entre els tres. N’hi ha algun que es pugui inicialitzar al constructor de la classe?

Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar() i un altre no estàtic anomenat accelerar(). El mètode accelerar ha de mostrar per consola: “El vehicle està accelerant” i el mètode frenar() ha de mostrar: “El vehicle està frenant”. 

Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.


⭐🌟 Nivell 2
-

#### 📍 [Exercici 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-1/tree/main/SPRINT1/Tasca%20S1%2001%20Her%C3%A8ncia%20i%20Polimorfism/n2exercici1)

Crea una classe anomenada "Telèfon" amb els atributs marca i model, i el mètode trucar(). Aquest mètode ha de rebre un String amb un número de telèfon. El mètode ha de mostrar per consola un missatge dient que s’està trucant al número rebut per paràmetre. 

Crea una interfície anomenada "Camera" amb el mètode fotografiar(), i una altra interfície anomenada Rellotge amb el mètode alarma().

Crea una classe anomenada "Smartphone" que sigui subclasse de "Telèfon" i que a la vegada implementi les interfícies "Camera" i "Rellotge".

El mètode fotografiar() ha de mostrar per consola: “S’està fent una foto” i el mètode alarma() ha de mostrar: “Està sonant l’alarma”.

Des del main() de l’aplicació, crea un objecte Smartphone i crida als mètodes anteriors.
