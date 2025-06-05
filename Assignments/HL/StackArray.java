
public class Q3PracticalAnswer
{
    // global variables and constants
    public final static int MAXSIZE = 10;
    public static int population = 0;
    public static String[] array = new String[MAXSIZE];

    public static boolean isFull()
    {
        return population == MAXSIZE;
    }

    public static boolean isEmpty()
    {
        return population == 0;
    }

    public static void printWholeArray()
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(i + ":" + array[i] + "  ");
        }
        System.out.printf("[ length: %d ]\n", array.length);
    }
    
    public static void printArray()
    {	for (int i = 0; i < MAXSIZE; i++)
        {
            if (array[i] != null)
                System.out.print(i + ":" + array[i] + "  ");
        }
        System.out.printf("[ population: %d ]\n", population);
    }
    
    public static void printReversedArray()
    {	for (int i = MAXSIZE-1; i >= 0; i--)
        {
            if (array[i] != null)
                System.out.print(i + ":" + array[i] + "  ");
        }
        System.out.printf("[ population: %d ]\n", population);
    }
    
    public static int free()
    {	int free = 0;
		for(int i = 0; i < MAXSIZE; i++)
		{	if( array[i] == null )
			{	free++;
			}
		}
		return free;
	}

    public static void add(String data)
    {	if( search(data) != -1 )
		{	System.out.println(data + " not addded. It's already in the array.");
			return;
		}
		if (isFull())
		{	for( int i = MAXSIZE-1; i > 0; i--)
			{	array[i] = array[i-1];
			}
			array[0] = data;
		} else {      
			array[MAXSIZE-1-population] = data;
			population++;
			//printArray(); // optional
		}
    }

    public static int search(String data)
    {	for (int i = 0; i < MAXSIZE; i++)
        {	if (array[i] != null)
             {   if (array[i].equalsIgnoreCase(data))
                {    return i;
		        }
			}
		}
        return -1;
    }
    
    public static String remove()
    {	if( isEmpty() )
		{	System.out.println("The array is empty, nothing to remove.");
			return null; // or return "";
		}
		String removed = array[MAXSIZE-population];
		array[MAXSIZE-population] = null;
		population--;
		return removed;
	}

    public static void main(String[] args)
    {
        System.out.println("printWholeArray() + length:\n   Expected output >>> 0:null  1:null  2:null  3:null  4:null  5:null  6:null  7:null  8:null  9:null  [ length: 10 ]");
        System.out.print("   Y O U R  output >>> "); printWholeArray();
        System.out.println("\nprintArray + population:\n   Expected output >>> [ population: 0 ]");
        System.out.print("   Y O U R  output >>> "); printArray();
        System.out.println("\nisFull()  method [false] >>> " + isFull());
        System.out.println("isEmpty() method [true]  >>> " + isEmpty());
        System.out.println("\nadd() method...");
		add("kiwi");
		add("jujube");
		add("imbe");
		add("gooseberry");
		add("fig");
		add("elderberry");
		add("dragonfruit");
		add("cherry");
		add("banana");
		add("apple");
        System.out.println("   Expected output >>> 0:apple  1:banana  2:cherry  3:dragonfruit  4:elderberry  5:fig  6:gooseberry  7:imbe  8:jujube  9:kiwi  [ population: 10 ]");
        System.out.print("   Y O U R  output >>> ");
        printArray();
        System.out.println("\nprintReversedArray() method:");
        System.out.println("   Expected output >>> 9:kiwi  8:jujube  7:imbe  6:gooseberry  5:fig  4:elderberry  3:dragonfruit  2:cherry  1:banana  0:apple  [ population: 10 ]");
        System.out.print("   Y O U R  output >>> ");
        printReversedArray();
        System.out.println("\nsearch(\"kiwi\")  method [9]: " + search("kiwi"));
        System.out.println("search(\"grape\") method [-1]: " + search("grape"));
        System.out.print("\nadd(\"fig\")   method (no duplicates): "); add("fig");
        System.out.print("add(\"apple\") method (no duplicates): "); add("apple");
        System.out.print("add(\"kiwi\")  method (no duplicates): "); add("kiwi");
        System.out.println("   Expected output >>> 0:apple  1:banana  2:cherry  3:dragonfruit  4:elderberry  5:fig  6:gooseberry  7:imbe  8:jujube  9:kiwi  [ population: 10 ]");
        System.out.print("   Y O U R  output >>> ");
        printArray();
        System.out.println("\nadd(\"longan\") method (overflow when array full)"); add("longan");
        System.out.println("add(\"plum\")   method (overflow when array full)"); add("plum");
        System.out.println("   Expected output >>> 0:plum  1:longan  2:apple  3:banana  4:cherry  5:dragonfruit  6:elderberry  7:fig  8:gooseberry  9:imbe  [ population: 10 ]");
        System.out.print("   Y O U R  output >>> ");
        printArray();
        System.out.println("\nremove() and free() methods:");
        System.out.println("   remove() [plum]  : " + remove() + "\tfree() [1]: " + free() );
        System.out.println("   remove() [longan]: " + remove() + "\tfree() [2]: " + free() );
        System.out.println("   Expected output >>> 2:apple  3:banana  4:cherry  5:dragonfruit  6:elderberry  7:fig  8:gooseberry  9:imbe  [ population: 8 ]");
        System.out.print("   Y O U R  output >>> ");
        printArray();
        
       
    }
}

