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

        System.out.println();
        VampireCat meowsferatu = new VampireCat("Meowsferatu",
                1877, 4);
        System.out.println(meowsferatu);
        meowsferatu.setCoat("Back+red stripes");
        System.out.println(meowsferatu.getCoat());
        System.out.println(meowsferatu.getName() +
                "'s age is " + meowsferatu.calculateAge());
        meowsferatu.talk();
        meowsferatu.eat();
        System.out.println(meowsferatu);
    }
}
