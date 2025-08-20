// no animals were harmed during the development of this class
public class AnimalTest
{
    public static void main(String[] args)
    {
        //Animal dog = new Animal(); // empty constructor
        Animal dog;
        //System.out.println(dog); // error because
        dog = new Animal("Fido Dido", 2017, false);
        System.out.println(dog);  // compare before and after toString method is added
        System.out.println(dog.getName());
        // print the remaining attributes of DOG
        System.out.println(dog.getBirthYear());
        System.out.println(dog.isDangerous());
        System.out.println(dog.getDangerous());
        // change DOG's name to "Snoopy" and print its name again
        dog.setName("Snoopy");
        System.out.println(dog.getName());
    }
}
