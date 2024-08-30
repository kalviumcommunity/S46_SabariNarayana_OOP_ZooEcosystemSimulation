public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        // Using 'this' to refer to the current object's variables
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return this.name; // Using 'this' to access the current object's name
    }

    public String getSpecies() {
        return this.species; // Using 'this' to access the current object's species
    }

    public void eat() {
        System.out.println(this.name + " the " + this.species + " is eating."); // Using 'this' in a method
    }

    public void move() {
        System.out.println(this.name + " the " + this.species + " is moving."); // Using 'this' in a method
    }
}