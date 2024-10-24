class Animal {
    private String name;
    private String species;
    private int id;
    private static int nextId = 1;  // Static variable to generate unique IDs
    private static int totalAnimals = 0;  // Static variable to count total animals

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        this.id = nextId++;
        totalAnimals++;
    }

    // Accessor methods
    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public int getId() {
        return this.id;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    // Mutator method
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(this.name + " the " + this.species + " is eating."); // Using 'this' in a method
    }

    public void move() {
        System.out.println(this.name + " the " + this.species + " is moving."); // Using 'this' in a method
    }

    // Overrides the toString() method to provide a custom string representation of the Animal object.
    @Override
    public String toString() {
        return "Animal ID: " + id + ", Name: " + name + ", Species: " + species;
    }
}