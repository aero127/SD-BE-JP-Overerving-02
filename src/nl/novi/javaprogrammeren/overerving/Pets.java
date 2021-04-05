package nl.novi.javaprogrammeren.overerving;

public class Pets extends Animal{
    protected String nameBoss;
    protected String favoriteFoodBrand;

    public Pets(String animalName, String sex, String species, String nameBoss, String favoriteFoodBrand) {
        super(animalName, sex, species);
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.nameBoss = nameBoss;
    }
    public String getNameBoss(){
        return animalName + " is de " + getSpecies() + " van " + nameBoss;
    }

    public String getFavoriteFoodBrand(){
        return animalName + " eet het liefste brokken speciaal voor de " + getSpecies() + " van het merk " + favoriteFoodBrand;
    }

    public void insideCat(boolean b) {
        if (b == false) {
            System.out.println(animalName + " gaat graag naar buiten");
        } else if (b == true) {
            System.out.println(animalName + " houdt er niet van om naar buiten te gaan");
        }
    }
}
