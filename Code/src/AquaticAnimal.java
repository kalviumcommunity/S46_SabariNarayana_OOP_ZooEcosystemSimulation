class AquaticAnimal extends WildAnimal {
    private boolean canSwim; // Additional attribute for AquaticAnimal

    // Constructor for AquaticAnimal
    public AquaticAnimal(String name, String species, String habitat, boolean canSwim) {
        super(name, species, habitat); // Calling the constructor of WildAnimal
        this.canSwim = canSwim;
    }

    // Accessor for canSwim
    public boolean isCanSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return super.toString() + ", Can Swim: " + canSwim; // Include canSwim in toString
    }
}