public class ZooSimulation {
    public void simulate(Zoo zoo) {
        zoo.showAnimals();
        for (Animal animal : zoo.getAnimals()) {
            animal.eat();
            animal.move();
        }
    }
}