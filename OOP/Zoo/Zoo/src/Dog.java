public class Dog extends Animal
{
    private String breed;

    public Dog(String name, int birthYear,
               boolean isDangerous, String breed)
    {
        super(name, birthYear, isDangerous);
        this.breed = breed;
    }

    public Dog(String name, int birthYear, String breed)
    {   super(name, birthYear);
        this.breed = breed;
    }

    public String getBreed()
    {   return breed;
    }

    public void setBreed(String breed)
    {   this.breed = breed;
    }

    @Override
    public void eat()
    {    System.out.println("chomp chomp");
    }

    @Override
    public void talk()
    {    System.out.println("Arf arf");
    }

    @Override
    public String toString()
    {    return  super.toString() +
            "     breed: " + breed;
    }
}
