public class zooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "aaa";
        lion.age = 5;
        lion.family = "Lion";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Park";
        myZoo.city = "Tunis";
       // myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];


        Animal a1 = new Animal("bbb", "ccc", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(a1));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(a1));
        Animal a2 = new Animal("bbb", "ccc", 2, true);
        System.out.println(myZoo.searchAnimal(a2));

        System.out.println(myZoo.removeAnimal(a2));
        myZoo.displayAnimals();

    }

}

