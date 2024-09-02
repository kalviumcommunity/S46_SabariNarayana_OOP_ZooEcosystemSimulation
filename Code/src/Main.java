public class Main {
    public static void main(String[] args) {
        // Dynamically allocate memory for Zoo object
        Zoo zoo = new Zoo();

        // Create an array of Animal objects
        // Dynamically allocate memory for Animal objects using the new keyword
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Leo", "Lion");
        animals[1] = new Animal("Ella", "Elephant");
        animals[2] = new Animal("Momo", "Monkey");

        // Add animals to the zoo using the array
        for (Animal animal : animals) {
            zoo.addAnimal(animal);
        }

        // Simulate zoo activities
        ZooSimulation simulation = new ZooSimulation();
        simulation.simulate(zoo);

        // In Java, there's no need to explicitly delete objects. The garbage collector handles it.
    }
}
