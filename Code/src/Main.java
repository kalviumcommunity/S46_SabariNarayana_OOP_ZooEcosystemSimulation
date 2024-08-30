public class Main {
    public static void main(String[] args) {
        // Create zoo
        Zoo zoo = new Zoo();

        // Create animals
        Animal lion = new Animal("Leo", "Lion");
        Animal elephant = new Animal("Ella", "Elephant");
        Animal monkey = new Animal("Momo", "Monkey");

        // Add animals to zoo
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);

        // Simulate zoo
        ZooSimulation simulation = new ZooSimulation();
        simulation.simulate(zoo);
    }
}