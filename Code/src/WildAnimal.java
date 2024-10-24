class WildAnimal extends Animal {
    private String habitat; // Additional attribute for WildAnimal

    // Constructor for WildAnimal, utilizing the superclass constructor
    public WildAnimal(String name, String species, String habitat) {
        super(name, species); // Calling the constructor of Animal
        this.habitat = habitat;
    }

    // Accessor for habitat
    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat; // Include habitat in toString
    }
}