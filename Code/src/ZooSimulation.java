//public class ZooSimulation {
//    public void simulate(Zoo zoo) {
//        zoo.showAnimals();
//        for (Animal animal : zoo.getAnimals()) {
//            animal.eat();
//            animal.move();
//        }
//    }
//}
class ZooSimulation {
    public void simulate(Zoo zoo) {
        System.out.println("Zoo Simulation Running...");
        System.out.println("Total Animals in Zoo: " + Animal.getTotalAnimals());
        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal);
            animal.eat();
            animal.move();
        }
    }
}