import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public boolean removeAnimal(int id) {
        for (Animal animal : this.animals) {
            if (animal.getId() == id) {
                this.animals.remove(animal);
                return true;
            }
        }
        return false;
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(this.animals);
    }
}