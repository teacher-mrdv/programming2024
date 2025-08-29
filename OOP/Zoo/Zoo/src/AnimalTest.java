// no animals were harmed during the development of this class
public class AnimalTest
{
    public static void main(String[] args)
    {
        //Animal dog = new Animal(); // empty constructor
        Animal dog;
        //System.out.println(dog); // error because
        dog = new Animal("Fido Dido", 2017, false);
        System.out.println(dog.toString());  // compare before and after toString method is added
        // no toString() in Animal class: Animal@30f39991 or similar
        // with toString() in the Animal class: Name: Fido Dido, birthYear: 2017, Dangerous: No
        System.out.println(dog.getName());
        // print the remaining attributes of DOG
        System.out.println(dog.getBirthYear());
        System.out.println(dog.isDangerous());
        System.out.println(dog.getDangerous());
        // change DOG's name to "Snoopy" and print its name again
        dog.setName("Snoopy");
        System.out.println(dog.getName());
        System.out.println(dog.toString());
        System.out.println(dog.getAge());
        dog.talk();
        dog.eat();
    }
}
