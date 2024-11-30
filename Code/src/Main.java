public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // Add animals using the new subclasses
        zoo.addAnimal(new Lion("Leo"));
        zoo.addAnimal(new Elephant("Ella"));
        zoo.addAnimal(new Monkey("Momo"));

        ZooPrinter printer = new ZooPrinter();
        printer.printAnimals(zoo);

        ZooSimulation simulation = new ZooSimulation();
        simulation.simulate(zoo);
    }
}