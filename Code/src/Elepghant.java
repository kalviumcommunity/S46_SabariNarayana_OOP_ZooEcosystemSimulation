class Elephant extends Animal {
    public Elephant(String name) {
        super(name, "Elephant");
    }

    // Implementing the abstract method
    @Override
    public void makeSound() {
        System.out.println(getName() + " the Elephant trumpets!");
    }
}