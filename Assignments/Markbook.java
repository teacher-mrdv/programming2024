public class Markbook
{
	public static final int MAXTESTS = 5; // maximum number of tests per student

	/* scoreToGrade: method to convert a percentage to a letter grade
		85-100 = A
		75-84  = B
		65-74  = C
		50-64  = D
		<50    = F
	*/
	public static String scoreToGrade(double score)
	{	// score is a % from 0 - 100 inclusive
		String grade = "";
		if( score < 0 || score > 100 ) // range validation
		{	grade = "Invalid";	}
//		else if( score >= 85 )
/* ... finish this simple method to...
 *		convert the score (double) into a letter grade (String).
 */
		return grade;
	}


	public static String[] calculate(int[][] scores)
	{	// calculate the average grade for each student, then
		// convert it to a letter grade with scoreToGrade method
		// and put result into a 3rd parallel array (averages)
        String[] averages = new String[scores.length];
		// your code goes here
		return null;
	}


	public static double classAverage(int[][] scores)
	{	// calculate the class average based on the 2D array with students scores
        double sum = 0;		// to add the scores of each student
		double average = 0; // to store the result
        // your code goes here
        return average;
	}

	// printMarkBookMethod to print the data provided only
	public static void printMarkBook(String[] names, int[][] scores)
	{
		final String TAB = "     ";
		int rowLength = scores.length;  // or names.length(), which should be the same
		int columnLength = scores[0].length;
		System.out.println("\nMarkbook\n========\n");
		for(int row = 0; row < rowLength; row++)
		{
			System.out.print( names[row] + TAB + TAB );
			for(int column = 0; column < columnLength; column++)
			{
				System.out.print( scores[row][column] + TAB );
			} // end for loop to output the test scores
			System.out.println(); // go down one line to print the next row
		} // end for loop to go through each student
	} // end printMarkBook

	// overloaded printMarkBook method to print all the data
	public static void printMarkBook(String[] names, int[][] scores, String[] results)
	{
		String tab = "\t";
		int classSize = scores.length;  // or names.length(), which should be the same
		System.out.println("\nMarkbook\n========\n");
		for(int s = 0; s < classSize; s++)
		{
			int tests = scores[s].length; // number of tests per student
			System.out.print( names[s] + tab + tab );
			for(int t = 0; t < tests; t++)
			{
				System.out.print( scores[s][t] + tab );
			} // end for loop to output the test scores
			System.out.println( results[s] );
		} // end for loop to go through each student
		double average = classAverage(scores);
		System.out.println("\nClass average = " + average + " = " + scoreToGrade(average) + "\n");
	} // end printMarkBook


	public static void main (String args[])
	{
		String[] students = { "Able", "Adam", "Alan", "Jeff", "John", "Karl", "Kean", "Luis", "Mike", "Seli" };

		int[][] testScores = {  { 85, 83, 77, 91, 76 },
								{ 80, 90, 95, 93, 48 },
								{ 78, 81, 11, 90, 73 },
								{ 92, 83, 30, 69, 87 },
								{ 23, 45, 96, 38, 59 },
								{ 60, 85, 45, 39, 67 },
								{ 77, 31, 52, 74, 83 },
								{ 93, 94, 89, 77, 97 },
								{ 79, 85, 28, 93, 82 },
								{ 85, 72, 49, 75, 63 }  };

		//String[] grades = calculate(testScores);
		printMarkBook(students, testScores);
		//printMarkBook(students, testScores, grades);

	} // end main

} // end class

/* EXPECTED OUTPUT ---------------------------------------

Markbook
========

Able            85      83      77      91      76      B
Adam            80      90      95      93      48      B
Alan            78      81      11      90      73      C
Geoff           92      83      30      69      87      C
Jon             23      45      96      38      59      D
Karl            60      85      45      39      67      D
Keane           77      31      52      74      83      D
Louie           93      94      89      77      97      A
Michael         79      85      28      93      82      C
Selina          85      72      49      75      63      C

Class average = 70.94 = C

Reflection questions:

What would happen if new student data was added and the array of student names was sorted to keep it organised?

If our arrays were defined with a length of 25,
	String[] students = new String[25];
	double[][] scores = new double[25][5];
can you think about an alternative to adding a "lastIndex" variable to keep track of the end of a partially filled array?
*/
