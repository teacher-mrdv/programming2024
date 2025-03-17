/*
 *	Practical Test IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class PracticalTestQ3
{
	// Array size:
	public static int size(double[] array)
	{
		int result = 0; // modify
		// your code goes here
		return result;
	}
	//------------------------------------------------------------------

	// Minimum:
	public static double min(double[] array)
	{
		double minimum = 0.0; // modify
		// your code goes here
		return minimum;
	}
	//------------------------------------------------------------------

	// Maximum:
	public static double max(double[] array)
	{
		double maximum = 0.0; // modify
		// your code goes here
		return maximum;
	}
	//------------------------------------------------------------------

	// Range
	public static double range(double[] array)
	{
		double range = 0.0; // modify / your code goes here
		return range;
	}
	//------------------------------------------------------------------

	// Average:
	public static double average(double[] array)
	{
		double average = 0.0; // modify
		// your code goes here
		return average;
	}
	//------------------------------------------------------------------

	// Mode:
	public static double mode(double array[])
	{
		double mode = 0.0;
		// your code goes here
		return mode;
	}
	//------------------------------------------------------------------

	// For the median to work, the array double[] MUST BE SORTED
	public static double median(double[] array)
	{
		Arrays.sort(array); // DO NOT REMOVE THIS LINE, it sorts the array
		double median = 0.0;
		//your code goes here
		return median;
	}

	public static double formatDouble(double x, int decimals)
	{	
		double result = 0.0; // modify
		// your code goes here
		return result;
	}
	//------------------------------------------------------------------
	
	public static void main (String args[]) throws IOException
	{
		
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");

		double rainfall[]    = load("rainfall.txt");	// load data from files
		double temperature[] = load("temperature.txt"); // into arrays

		System.out.println( "\nSingapore Rainfall Statistics" );
		System.out.println( "Measurements   : " + size(rainfall) );
		System.out.println( "Minimum   (0.2): " + min(rainfall) );
		System.out.println( "Maximum (765.9): " + max(rainfall) );
		System.out.println( "Range   (765.7): " + range(rainfall) );
		System.out.println( "Average(178.89): " + average(rainfall) );
		System.out.println( "Mode    (127.2): " + mode(rainfall) );
		System.out.println( "Median  (159.7): " + median(rainfall) );

		System.out.println( "\nSingapore Temperature Statistics" );
		
		/* ******************************************************************\
		 * WRITE THE APPROPRIATE CODE TO PROCESS THE TEMPERATURE ARRAY HERE  /
		 *******************************************************************/
		System.out.println();
		
		
		
	}


    //------------------------------------------
	//- DO NOT MODIFY THE CODE BELOW THIS LINE -
	//------------------------------------------
    
    public static double[] load(String fileName) throws IOException
    {
        //System.out.println("<<< Loading data >>>");
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return null;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		double[] data = new double[countLines(fileName)];
		while ( br.ready() )
		{
            temp = br.readLine();
            data[count] = Double.parseDouble(temp);
            count++;
        }
        br.close();
        System.out.println(fileName + " file loaded.");// optional
        return data;
    }

    public static int countLines(String fileName) throws IOException
    {
        File file = new File(fileName);
        if ( !file.exists() )
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return 0;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		while ( br.ready() )
		{
			temp = br.readLine();
            count++;
        }
        br.close();
        return count;
    }


}


