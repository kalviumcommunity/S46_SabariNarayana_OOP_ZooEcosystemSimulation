public abstract class Animal {
    private String name;
    private String species;
    private int id;
    private static int nextId = 1;
    private static int totalAnimals = 0;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        this.id = nextId++;
        totalAnimals++;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getId() {
        return id;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    // Abstract method for sound
    public abstract void makeSound();

    public void eat() {
        System.out.println(this.name + " the " + this.species + " is eating.");
    }

    public void move() {
        System.out.println(this.name + " the " + this.species + " is moving.");
    }

    @Override
    public String toString() {
        return "Animal ID: " + id + ", Name: " + name + ", Species: " + species;
    }
}