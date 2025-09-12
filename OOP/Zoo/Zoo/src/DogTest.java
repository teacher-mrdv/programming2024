public class DogTest
{
    public static void main(String[] args)
    {
        Dog diciembre =
                new Dog("Diciembre", 2022,
                        false, "terrier");
        System.out.println(diciembre); // this tests toString() implicitly
        diciembre.setBreed("Cerberus");
        System.out.println(diciembre.getBreed());
        System.out.println(diciembre);
    }
}
