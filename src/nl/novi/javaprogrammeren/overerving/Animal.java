package nl.novi.javaprogrammeren.overerving;

public class Animal {
    protected String animalName;
    protected String sex;
    protected String species;

    public Animal(String animalName, String sex, String species) {
        this.animalName = animalName;
        this.sex = sex;
        this.species = species;
    }

    public String getName() {
        return animalName;
    }

    public String getSex() {
        return sex;
    }

    public String getSpecies() {
        return species;
    }

    public double move(int steps) {
        double move = (double) (steps * 0.25);
        return move;
    }

    public String makeSound(String roar) {
        return roar;
    }
    public String lastDayFed(String vreten) {
        return vreten;
    }

    public String origin(String origin) {
        return "het land van herkomst is " + origin;
    }
}

