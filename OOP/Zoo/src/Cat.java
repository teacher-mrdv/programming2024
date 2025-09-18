public class Cat extends Animal
{
    private String coat;

    public Cat(String name, int birthYear, String coat)
    {   super(name, birthYear);
        this.coat = coat;
    }

    public Cat(String name, int birthYear,
               boolean isDangerous, String coat)
    {   super(name, birthYear, isDangerous);
        this.coat = coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public String getCoat() {
        return coat;
    }

    public String toString() {
        return super.toString() + ", Coat: " +
                this.getCoat();
    }

    public void talk() {
        System.out.println("Meow meow");
    }

    public void eat() {
        System.out.println("Nibble nibble");
    }


    public boolean equals(Cat cat2) {
        return this.getName().equalsIgnoreCase(cat2.getName()) &&
                this.getBirthYear() == cat2.getBirthYear();
    }
}
