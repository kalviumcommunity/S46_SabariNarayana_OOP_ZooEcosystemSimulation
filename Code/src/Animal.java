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

    @Override
    public String toString() {
        return "Animal ID: " + id + ", Name: " + name + ", Species: " + species;
    }
}