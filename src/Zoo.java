public class Zoo {

    Animal[] animals;
    String name, city;
    public final int nbrCages=25;

    int nbrAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N°de cages par animal: " + nbrCages);
    }

    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (nbrAnimals == nbrCages)
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° cage par animal : " + nbrCages;
    }
}
