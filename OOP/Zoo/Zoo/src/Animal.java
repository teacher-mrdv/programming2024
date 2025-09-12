import java.util.Date;

public class Animal
{// Attributes/fields/instance variable
    private String name;
    private int birthYear;
    private boolean isDangerous;

    // empty constructor
    public Animal() { }

    // custom constructor
    public Animal(String name, int birthYear, boolean isDangerous)
    {   this.name = name;
        this.birthYear = birthYear;
        this.isDangerous = isDangerous;
    }

    public Animal(String name, int birthYear)
    {   this.name = name;
        this.birthYear = birthYear;
        this.isDangerous = false;
    }

    public String getName()
    {   return name;
    }

    public void setName(String name)
    {   this.name = name;
    }

    public int getBirthYear()
    {   return birthYear;
    }

    public void setBirthYear(int birthYear)
    {   this.birthYear = birthYear;
    }

    public boolean isDangerous()
    {   return isDangerous;
    }

    public void setDangerous(boolean dangerous)
    {   isDangerous = dangerous;
    }

    public String getDangerous()
    {   if(isDangerous) // no need for == true
            return "Yes";
        else
            return "No";
    }

    // calculates the age of the animal in years
    // USES the Java Date class from util
    public int calculateAge()
    {   Date currentDate = new Date();
        int currentYear = currentDate.getYear() + 1900;
        return currentYear - birthYear;
    }

    /*  different parameter naming style for the constructor
    public Animal(String n, int bY, boolean isD)
    {   name = n;
        birthYear = bY;
        isDangerous = isD;
    }
    */

    // provides a String representation of an Animal object
    // Overrides the toString() method from the Object superclass
    @Override
    public String toString()
    {
        return "Name: " + name +
                ", birthYear: " + birthYear +
                ", Dangerous: " + getDangerous();
    }

    public void talk()
    {   System.out.println(this.name + " doesn't talk.");
    }

    public void eat()
    {   System.out.println(name + " doesn't eat");
    }

    /* It's not recommended to have a main method in OOP blueprint classes
    public static void main(String[] args)
    {   //Animal dog = new Animal(); // call the empty constructor
        Animal dog; // declaration and initialisation can be broken down or in one line
        //System.out.println(dog); // not initialised error
        dog = new Animal("Fido Dido", 2017, false);
        System.out.println(dog); // compare before and after toString method is added
        // no toString() in Animal class: Animal@30f39991 or similar
        // with toString() in the Animal class: Name: Fido Dido, birthYear: 2017, Dangerous: No
        System.out.println(dog.name);  // this is only allowed within this class!
        // print the remaining attributes of dog
        System.out.println(dog.birthYear);
        System.out.println(dog.isDangerous);
        // change FIDO's name to "Snoopy" and print its name again
        dog.name = "Snoopy";
        System.out.println(dog.name);
    }

    */
}
