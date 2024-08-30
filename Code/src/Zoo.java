import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        // Using 'this' to refer to the current object's variable
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal); // Using 'this' to refer to the current object's list
        System.out.println(animal.getName() + " the " + animal.getSpecies() + " has been added to the zoo.");
    }

    public void showAnimals() {
        System.out.println("Animals in the zoo:");
        for (Animal animal : this.animals) { // Using 'this' to refer to the current object's list
            System.out.println(animal.getName() + " the " + animal.getSpecies());
        }
    }

    // Method to get the list of animals
    public List<Animal> getAnimals() {
        return this.animals; // Using 'this' to refer to the current object's list
    }
}