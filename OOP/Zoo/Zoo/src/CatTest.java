public class CatTest
{
    public static void main(String[] args)
    {
        Cat garfield = new Cat("Garfield", 1978, false, "Orange");
        System.out.println(garfield);
        garfield.setCoat("Orange+black stripes");
        System.out.println(garfield.getCoat());
        System.out.println(garfield.getName() +
                "'s age is " + garfield.calculateAge());
        garfield.talk();
        garfield.eat();
    }
}
