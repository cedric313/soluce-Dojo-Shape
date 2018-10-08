## Shape

Créer les classes de différentes formes :
* `Rectangle`, `Triangle` et `Circle` héritent de la classe abstraite `Shape`
* `Square` hérite de `Rectangle`

Créer la méthode abstraite `area()` dans `Shape` et ajouter l'implémentation de cette méthode dans les classes héritées :

* La surface d'un carré est le carré de son côté
* La surface d'un rectangle est sa hauteur multipliée par sa largeur
* La surface d'un triangle est sa base multipliée par sa hauteur divisée par 2.
* La surface d'un cercle est le carré de son rayon multiplié par π

Utiliser la valeur correcte de π pour les calculs :

    Math.PI

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar ShapeTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore ShapeTest
