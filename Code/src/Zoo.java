import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " the " + animal.getSpecies() + " has been added to the zoo.");
    }

    public void showAnimals() {
        System.out.println("Animals in the zoo:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " the " + animal.getSpecies());
        }
    }

    // New method to get the list of animals
    public List<Animal> getAnimals() {
        return animals;
    }
}