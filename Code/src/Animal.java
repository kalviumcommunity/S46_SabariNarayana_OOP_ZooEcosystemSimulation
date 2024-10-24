class Animal {
    private String name;           // Private: Only accessible within the Animal class
    private String species;        // Private: Only accessible within the Animal class
    private int id;                // Private: Only accessible within the Animal class
    private static int nextId = 1; // Static variable, should be private to prevent external modification
    private static int totalAnimals = 0; // Static variable, should be private to prevent external modification

    // Default constructor: Initializes with default values
    public Animal() {
        this.name = "Unknown";
        this.species = "Unknown";
        this.id = nextId++;
        totalAnimals++;
    }

    // Parameterized constructor: Initializes with provided values
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        this.id = ++totalAnimals;
    }

    // Public accessors: Accessible from outside the class
    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public int getId() {
        return this.id;
    }

    // Static function to get the total number of animals
    public static int getTotalAnimals() {
        return totalAnimals;
    }

    // Public mutators: Allows controlled modification of private fields
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
