public class ZooPrinter {
    public void printAnimals(Zoo zoo) {
        System.out.println("Animals in the zoo:");
        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal);
        }
    }

    public void printAnimalDetails(Animal animal) {
        System.out.println(animal + " is part of the zoo.");
    }

    public void printTotalAnimals() {
        System.out.println("Total Animals in Zoo: " + Animal.getTotalAnimals());
    }
}