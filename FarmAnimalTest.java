
public class FarmAnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Missy");
        Dog dog = new Dog("Lassy");
        Cow cow = new Cow("Nossy");
        System.out.println(cat.getName() + ": " + cat.talk());
        System.out.println(dog.getName() + ": " + dog.talk());
        System.out.println(cow.getName() + ": " + cow.talk()); 
    }
}
