public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void eat() {
        System.out.println(name + " the " + species + " is eating.");
    }

    public void move() {
        System.out.println(name + " the " + species + " is moving.");
    }
}