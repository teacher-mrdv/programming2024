/*
 * HINTS for the parallel arrays challenge/mock test/test preparation task
 * 
 */
public class ContactsDB
{
    public static String[]  contactNames = new String[10];
    public static long[]    phoneNumbers = new long[10];
    public static int entries = 0;

    public static void printArrays()
    {	
		// your code goes here to print the contents of both arrays
    }
    public static boolean isFull()
    {
		// your code goes here
    }
    public static void addEntry(String name, long number)
    {
        // your code goes here
    }

    public static String findName(long number)
    {
        // your code goes here
    }

    public static void sortByName()
    {
        // your code goes here -- recommended: use the selection sort to sort the names
        // you will need to use compareTo() to compare Strings
    }

    public static void sortByNumber()
    {
        // your code goes here -- recommended: use the selection sort to sort the phone numbers (long)
    }

    public static String superFindName(long number)
    {
		// your code goes here
    }

    public static boolean isSorted()
    {   // your code goes here
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Populating arrays...");
        addEntry("Mick", 19672022);
        addEntry("Peter", 19671970);
        addEntry("Jeremy", 19671971);
        addEntry("John", 19972022);
        addEntry("Christine", 19702022);
        addEntry("Dave", 19721973);
        addEntry("Lindsey", 19742018);
        addEntry("Stevie", 19742922);
        addEntry("Bekka", 19931995);
        addEntry("Neil", 20182022);
        addEntry("Guy", 20202022);	// this should not work and output an error

        System.out.println("\nOriginal arrays");
        printArrays();
        System.out.println("\nArrays sorted by name");
        sortByName();
        printArrays(); System.out.println();
        System.out.println( "Testing findName(19672022) [Mick] : "
                + findName(19672022));
        System.out.println( "Testing findName(19931995) [Bekka] : "
                + findName(19931995));
        System.out.println( "Testing findName(19702022) [Christine] : "
                + findName(19702022));
        System.out.println( "Testing findName(123456789) [New number] : "
                + findName(123456789));
        System.out.println();
        System.out.println( "Testing superFindName(19972022) [John] : "
                + superFindName(19972022));
        System.out.println( "Testing superFindName(19742922) [Stevie] : "
                + superFindName(19742922));
        System.out.println( "Testing superFindName(19742018) [Lindsey] : "
                + superFindName(19742018));
        System.out.println( "Testing superFindName(987654321) [New number] : "
                + superFindName(987654321));
        System.out.println("\nArrays after using superFindName (sorted by number)");
        printArrays();
    }

}

/*  --------------EXPECTED OUTPUT--------------
        Populating arrays...
        Error-database full

        Original arrays
        0: Mick      : 19672022
        1: Peter     : 19671970
        2: Jeremy    : 19671971
        3: John      : 19972022
        4: Christine : 19702022
        5: Dave      : 19721973
        6: Lindsey   : 19742018
        7: Stevie    : 19742922
        8: Bekka     : 19931995
        9: Neil      : 20182022

        Arrays sorted by name
        0: Bekka     : 19931995
        1: Christine : 19702022
        2: Dave      : 19721973
        3: Jeremy    : 19671971
        4: John      : 19972022
        5: Lindsey   : 19742018
        6: Mick      : 19672022
        7: Neil      : 20182022
        8: Peter     : 19671970
        9: Stevie    : 19742922

        Testing findName(19672022) [Mick] : Mick
        Testing findName(19931995) [Bekka] : Bekka
        Testing findName(19702022) [Christine] : Christine
        Testing findName(123456789) [New number] : New number

        Testing superFindName(19972022) [John] : John
        Testing superFindName(19742922) [Stevie] : Stevie
        Testing superFindName(19742018) [Lindsey] : Lindsey
        Testing superFindName(987654321) [New number] : New number

        Arrays after using superFindName (sorted by number)
        0: Peter     : 19671970
        1: Jeremy    : 19671971
        2: Mick      : 19672022
        3: Christine : 19702022
        4: Dave      : 19721973
        5: Lindsey   : 19742018
        6: Stevie    : 19742922
        7: Bekka     : 19931995
        8: John      : 19972022
        9: Neil      : 20182022
*/
