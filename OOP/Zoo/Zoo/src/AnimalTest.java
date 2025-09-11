import java.util.Scanner;

// no animals were harmed during the development of this class
public class AnimalTest
{
    public static void main(String[] args)
    {
        //Animal newAnimal = new Animal(); // empty constructor
        Animal newAnimal;
        //System.out.println(newAnimal); // error because
        newAnimal = new Animal("Fido Dido", 2017, false);
        System.out.println(newAnimal.toString());  // compare before and after toString method is added
        // no toString() in Animal class: Animal@30f39991 or similar
        // with toString() in the Animal class: Name: Fido Dido, birthYear: 2017, Dangerous: No
        System.out.println(newAnimal.getName());
        // print the remaining attributes of newAnimal
        System.out.println(newAnimal.getBirthYear());
        System.out.println(newAnimal.isDangerous());
        System.out.println(newAnimal.getDangerous());
        // change newAnimal's name to "Snoopy" and print its name again
        newAnimal.setName("Snoopy");
        System.out.println(newAnimal.getName());
        System.out.println(newAnimal.getAge());
        System.out.println(newAnimal.toString());
        newAnimal.talk();
        newAnimal.eat();


        /*Scanner input = new Scanner(System.in);
        int x = input.nextInt(); // nextInt() is a non-static method
        System.out.println( Math.sqrt(x) ); // sqrt() is a static method
        input.close();
        Animal cat = new Animal(); // empty constructor
        System.out.println(cat); */
    }
}
