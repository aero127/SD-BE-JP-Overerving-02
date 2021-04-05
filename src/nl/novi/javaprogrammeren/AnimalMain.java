package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.Animal;
//import nl.novi.javaprogrammeren.overerving.Cat;
//import nl.novi.javaprogrammeren.overerving.Dog;
import nl.novi.javaprogrammeren.overerving.Pets;
import nl.novi.javaprogrammeren.overerving.WildAnimals;
//import nl.novi.javaprogrammeren.overerving.Wolf;

public class AnimalMain {

    public static void main(String[] args) {
        //Dog lassie = new Dog("Lassie", "male", "Haarbal", "BaasB", "Pedigree Pal");
        //System.out.println("De naam hond is " + lassie.getName() + ", hij vreet " + lassie.getFavoriteFoodBrand() + " en hij heeft " + lassie.lastDayFed("gisteren" + " voor het laatst eten gehad."));
       // System.out.println("De hond heeft " + lassie.move(6) + " meter gelopen");
       // Cat tommy = new Cat("Tommy", "kater", "Siamees");
      //  System.out.println("Dit is onze kat genaamd " + tommy.getName() + ", hij is een " + tommy.getSex() + " en een " + tommy.getSpecies());
       // System.out.println(tommy.getName() + " loopt dagelijks " + tommy.move(100) + " meter en hij brult; " + tommy.makeSound("miAUWWWWWWW"));
       // Wolf bozeWolf = new Wolf("Dolfje", "male" ,"wolf", "WolfPack", "hok3");
       // System.out.println("Onze wolf heet " + bozeWolf.getName() + " en is een " + bozeWolf.getSex() + " " + bozeWolf.getSpecies() + " die behoort tot de " + bozeWolf.getWolfPack() + ", " + bozeWolf.origin("de BoesBoes ") + "en deze " + bozeWolf.getSpecies() + " slaapt in " + bozeWolf.getThePen());
       // System.out.println("Elke dag loopt " + bozeWolf.getName() + " " + bozeWolf.move(10000) + " om aan eten te komen. Hij heeft " + bozeWolf.lastDayFed("gisteren") + " voor het laatst gegeten.");
        WildAnimals wolf = new WildAnimals("Weerwolfje", "male", "wolf");
        WildAnimals tiger = new WildAnimals("Tijgah", "teef","tijger");
        WildAnimals lion = new WildAnimals("Loekie", "non-binair", "leeuw");

        System.out.println(tiger.numberOfStripes("515"));
        System.out.println(lion.numberOfCubs("15"));
        Pets dog = new Pets("Lassie", "Reu", "hond", "BaasB", "Pedigree Pal");
        System.out.println(dog.getNameBoss());
        System.out.println(dog.getFavoriteFoodBrand());
        Pets cat = new Pets("Garfield", "kater", "kat", "Ma Flodder", "Felix");
        System.out.println(cat.getFavoriteFoodBrand());
        System.out.println(cat.getNameBoss());
        cat.insideCat(false);
        System.out.println(cat.getName() + " schrikt zich de tiefestering en schreeuwt " + cat.makeSound("miAUUUUUUUUUWwWWWWWW!!!!"));

        System.out.println(wolf.getName() + " is een " + wolf.getSex() + " " + wolf.getSpecies() + " en " + wolf.getThePen("hok nummero 3"));
        System.out.println(wolf.wolfPack("WP"));
        System.out.println(wolf.getName() + " loopt elke avond " + wolf.move(25000) + " meter op zoek naar vleeschh.");
        System.out.println(wolf.getName() + " heeft " + wolf.lastDayFed("zaterdag") + " voor het laatst een lekkere maal gehad.");
    }
    /*
    Het is traditie om overerving uit te leggen met behulp van dieren. Hier ontkomen jullie dus ook niet aan.
    Opdracht
    Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen hoef
    je nog niet te maken.

    Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op en de hoeveelheid kinderen.

    Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op. Ook willen we het aantal strepen weten.

    Van een Hond slaan we naam, naam van het baasje, favoriete voedselmerk, geslacht en soort op.
    Van een Kat slaan we de naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op. Ook willen we weten
    of het een binnen of buitenkat is.

    Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
    herkomst op. Ook willen we de naam van de roedel weten.

    Alle dieren moeten kunnen bewegen. Dit moet als methode toegevoegd worden. Wanneer een dier beweegt print je in
    de console dat deze 0.25 meter is verplaatst.

    Alle dieren moeten ook een maak-geluid-methode hebben waarmee je het geluid van de dieren afdrukt naar de console.

    Alle dieren slapen 8 uur per dag. Maak een methode slapen en print dit uit wanneer de methode wordt aangeroepen.

    Alle dieren eten. Maak een methode die een String ontvangt en print dan uit wat het dier eet.

    Alles staat hier in het Nederlands beschreven. Schrijf je klassen-, variabele en methodenamen in het Engels.

     */

}
