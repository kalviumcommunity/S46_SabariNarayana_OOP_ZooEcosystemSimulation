class Animal {
    private String name;
    private String species;
    private int id;
    // Static variable to track the total number of animals
    private static int totalAnimals = 0;  // Static variable to count total animals

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        this.id = ++totalAnimals;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public void eat() {
        System.out.println(this.name + " the " + this.species + " is eating."); // Using 'this' in a method
    }

    public void move() {
        System.out.println(this.name + " the " + this.species + " is moving."); // Using 'this' in a method
    }

    public int getId() {
        return this.id;
    }

    // Static function to get the total number of animals
    public static int getTotalAnimals() {
        return totalAnimals;
    }

    // Overrides the toString() method to provide a custom string representation of the Animal object.
    @Override
    public String toString() {
        return "Animal ID: " + id + ", Name: " + name + ", Species: " + species;
    }
}