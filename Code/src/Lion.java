class Lion extends Animal {
    public Lion(String name) {
        super(name, "Lion");
    }

    // Implementing the abstract method
    @Override
    public void makeSound() {
        System.out.println(getName() + " the Lion roars!");
    }
}