import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    // Public method to add an animal: Accessible from outside the class
    public void addAnimal(Animal animal) {
        this.animals.add(animal); // Using 'this' to refer to the current object's list
        System.out.println(animal.getName() + " the " + animal.getSpecies() + " has been added to the zoo.");
    }

    // Public method to show animals: Accessible from outside the class
    public void showAnimals() {
        System.out.println("Animals in the zoo:");
        for (Animal animal : this.animals) { // Using 'this' to refer to the current object's list
            System.out.println(animal.getName() + " the " + animal.getSpecies());
        }
    }

    // Public accessor method to get a copy of the list of animals
    public List<Animal> getAnimals() {
        return new ArrayList<>(this.animals); // Returns a copy of the list
    }

    // Public method to remove an animal: Accessible from outside the class
    public boolean removeAnimal(int id) {
        for (Animal animal : this.animals) {
            if (animal.getId() == id) {
                this.animals.remove(animal);
                System.out.println(animal.getName() + " has been removed from the zoo.");
                return true;
            }
        }
        System.out.println("No animal found with ID: " + id);
        return false;
    }
}