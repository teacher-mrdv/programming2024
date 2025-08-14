public class Animal
{
    // Attributes/fields/instance variable
    private String name;
    private int birthYear;
    private boolean isDangerous;

    public Animal(String name, int birthYear, boolean isDangerous)
    {
        this.name = name;
        this.birthYear = birthYear;
        this.isDangerous = isDangerous;
    }

    public static void main(String[] args)
    {
        Animal fido = new Animal("Fido Dido", 2017, false);
        System.out.println(fido.name);
    }
}
