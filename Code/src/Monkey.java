public class Monkey extends Animal {
    public Monkey(String name) {
        super(name, "Monkey");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the Monkey chatters!");
    }
}