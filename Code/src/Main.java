public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Leo", "Lion");
        animals[1] = new Animal("Ella", "Elephant");
        animals[2] = new Animal("Momo", "Monkey");

        for (Animal animal : animals) {
            zoo.addAnimal(animal);
        }

        ZooPrinter printer = new ZooPrinter();
        printer.printAnimals(zoo);
        printer.printTotalAnimals();

        ZooSimulation simulation = new ZooSimulation();
        simulation.simulate(zoo);
    }
}