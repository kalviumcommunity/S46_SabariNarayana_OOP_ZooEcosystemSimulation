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

    // Accessor method to get the list of animals (you may consider returning a copy to preserve encapsulation)
    public List<Animal> getAnimals() {
        return new ArrayList<>(this.animals); // Returns a copy of the list
    }

    // Mutator method to remove an animal by ID (demonstrating more encapsulation)
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