package nl.novi.javaprogrammeren.overerving;

public class WildAnimals extends Animal {
//    protected String wolfPack;
    protected String thePen;

    public WildAnimals(String animalName, String sex, String species) {
        super(animalName, sex, species);
        this.thePen = thePen;
//        this.wolfPack = wolfPack;
    }

    public String wolfPack(String wolfPack) {
        return animalName + " behoort tot de " + wolfPack + " roedel";
    }

    public String getThePen(String hok) {
        return animalName + " slaapt in " + hok;
    }

    public String numberOfStripes(String numberOfStripes) {
        return animalName + " heeft " + numberOfStripes + " zwarte strepen op zijn lichaam";
    }

    public String numberOfCubs(String numberOfCubs) {
        return animalName + " is vader van " + numberOfCubs + " jonge welpjes.";
    }
}
