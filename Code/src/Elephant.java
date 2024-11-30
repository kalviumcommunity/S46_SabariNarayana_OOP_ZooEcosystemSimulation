public class Elephant extends Animal {
    public Elephant(String name) {
        super(name, "Elephant");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the Elephant trumpets!");
    }
}