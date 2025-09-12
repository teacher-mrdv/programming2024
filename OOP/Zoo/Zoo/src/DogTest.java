public class DogTest
{
    public static void main(String[] args)
    {
        Dog diciembre =
                new Dog("Diciembre", 2022,
                        false, "Pomeranian");
        System.out.println(diciembre); // this tests toString() implicitly
        diciembre.setBreed("Vampire Pomeranian");
        diciembre.setDangerous(true); // we can use public methods from the superclass
        System.out.println(diciembre.getBreed());
        System.out.println(diciembre);
        diciembre.eat();
        diciembre.talk();
    }
}
