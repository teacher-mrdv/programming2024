/*
 *	Practical Test IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class ArraysStatsAnswer
{
	//------------------------------------------------------------------
	// Array size:
	public static int size(double[] array)
	{
		return array.length;
	}

	// Minimum:
	public static double min(double[] array)
	{
		double minimum = array[0];
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < minimum)
			{
				minimum = array[i];
			}
		}
		return minimum;
	}
	//------------------------------------------------------------------

	// Maximum:
	public static double max(double[] array)
	{
		double maximum = array[0];
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] > maximum)
			{
				maximum = array[i];
			}
		}
		return maximum;
	}
	//------------------------------------------------------------------

	// Range
	public static double range(double[] array)
	{
		return max(array) - min(array);
	}
	//------------------------------------------------------------------

	// Average:
	public static double average(double[] array)
	{
		double sum = 0.0;
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		return sum / array.length;
	}
	//------------------------------------------------------------------

	// Mode:
	public static double mode(double array[])
	{
		double maxValue = 0.0;
		int maxCount = 0;

		for (int i = 0; i < array.length; ++i)
		{
			int count = 0;
			for (int j = 0; j < array.length; ++j)
			{
				if ( array[i] == array[j] )
				{
					count++;
				}
			}
			if (count > maxCount)
			{
				maxCount = count;
				maxValue = array[i];
			}
		}
		return maxValue;
	}
	//------------------------------------------------------------------

	// For the median to work, the array double[] MUST BE SORTED
	public static double median(double[] array)
	{
		Arrays.sort(array);
		int middle = array.length / 2;
		if (array.length % 2 != 0)
		{
			return array[middle];
		}
		else
		{
			return (array[middle - 1] + array[middle]) / 2;
		}
	}

	public static double precision(double x, int decimals)
	{	
		double factor = 10 * decimals;
		return (int)(x * factor) / factor;
	}

	public static void main (String args[]) throws IOException
	{
		System.out.println("John Wick");
		
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");

		double rainfall[]    = load("rainfall.txt");	// load data from files
		double temperature[] = load("temperature.txt"); // into arrays

		System.out.println( "\nRainfall in SG - Stats" );
		System.out.println( size(rainfall) + " measurements\n" );
		System.out.println( "Minimum   (0.2): " + min(rainfall) );
		System.out.println( "Maximum (765.9): " + max(rainfall) );
		System.out.println( "Range   (765.7): " + range(rainfall) );
		System.out.println( "Average(178.89): " + average(rainfall) );
		System.out.println( "Mode    (127.2): " + mode(rainfall) );
		System.out.println( "Median  (159.7): " + median(rainfall) );

		System.out.println( "\nTemperature in SG - Stats" );
		System.out.println( size(temperature)  + " measurements\n" );
		System.out.println( "Minimum (25.4): " + min(temperature) );
		System.out.println( "Maximum (29.5): " + max(temperature) );
		System.out.println( "Range    (4.1): " + range(temperature) );
		System.out.println( "Average(27.62): " + average(temperature) );
		System.out.println( "Mode    (27.3): " + mode(temperature) );
		System.out.println( "Median  (27.7): " + median(temperature) );
		System.out.println();

		rainfall    = load("rainfall.txt");
		temperature = load("temperature.txt");
		
		System.out.println( "\nRainfall in SG - Stats" );
		System.out.println( size(rainfall) + " measurements\n" );
		System.out.println( "Minimum   (0.2): " + precision( min(rainfall), 2) );
		System.out.println( "Maximum (765.9): " + precision( max(rainfall), 2) );
		System.out.println( "Range   (765.7): " + precision( range(rainfall), 2) );
		System.out.println( "Average(178.89): " + precision( average(rainfall), 2) );
		System.out.println( "Mode   (127.20): " + precision( mode(rainfall), 2) );
		System.out.println( "Median (159.69): " + precision( median(rainfall), 2) );

		System.out.println( "\nTemperature in SG - Stats" );
		System.out.println( size(temperature)  + " measurements\n" );
		System.out.println( "Minimum (25.4): " + precision( min(temperature), 2) );
		System.out.println( "Maximum (29.5): " + precision( max(temperature), 2) );
		System.out.println( "Range    (4.1): " + precision( range(temperature), 2) );
		System.out.println( "Average(27.62): " + precision( average(temperature), 2) );
		System.out.println( "Mode    (27.3): " + precision( mode(temperature), 2) );
		System.out.println( "Median  (27.7): " + precision( median(temperature), 2) );
		System.out.println();

		rainfall    = load("rainfall.txt");
		temperature = load("temperature.txt");
		
		System.out.println( "\nRainfall in SG - Stats" );
		System.out.println( size(rainfall) + " measurements\n" );
		System.out.printf( "Minimum   (0.2): %6.2f\n", min(rainfall) );
		System.out.printf( "Maximum (765.9): %6.2f\n", max(rainfall) );
		System.out.printf( "Range   (765.7): %6.2f\n", range(rainfall) );
		System.out.printf( "Average(178.89): %6.2f\n", average(rainfall) );
		System.out.printf( "Mode   (127.20): %6.2f\n", mode(rainfall) );
		System.out.printf( "Median (159.69): %6.2f\n", median(rainfall) );

		System.out.println( "\nTemperature in SG - Stats" );
		System.out.println( size(temperature)  + " measurements\n" );
		System.out.printf( "Minimum (25.4): %6.2f\n", min(temperature) );
		System.out.printf( "Maximum (29.5): %6.2f\n", max(temperature) );
		System.out.printf( "Range    (4.1): %6.2f\n", range(temperature) );
		System.out.printf( "Average(27.62): %6.2f\n", average(temperature) );
		System.out.printf( "Mode    (27.3): %6.2f\n", mode(temperature) );
		System.out.printf( "Median  (27.7): %6.2f\n", median(temperature) );
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


