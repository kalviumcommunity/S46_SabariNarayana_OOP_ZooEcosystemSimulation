public class Bird extends Animal {
    public Bird(String name) {
        super(name, "Bird");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the Bird chirps!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " the Bird flies gracefully.");
    }
}