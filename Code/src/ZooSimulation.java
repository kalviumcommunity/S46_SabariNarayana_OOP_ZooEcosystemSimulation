public class ZooSimulation {
    public void simulate(Zoo zoo) {
        System.out.println("Zoo Simulation Running...");
        for (Animal animal : zoo.getAnimals()) {
            animal.eat();
            animal.move();
        }
    }
}