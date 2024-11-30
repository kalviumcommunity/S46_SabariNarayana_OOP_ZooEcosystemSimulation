public class ZooSimulation {
    public void simulate(Zoo zoo) {
        System.out.println("Zoo Simulation Running...");
        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal);
            animal.eat();
            animal.move();
            animal.makeSound(); // New behavior added without modifying the Animal class
        }
    }
}