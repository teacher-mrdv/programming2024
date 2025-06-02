public class MarkbookAnswer
{
	public static final int MAXTESTS = 5; // maximum number of tests per student


	public static String scoreToGrade(double score)
	{	// score is a % from 0 - 100 inclusive
		String grade = "";
		if( score < 0 || score > 100 ) // range validation
		{	grade = "Invalid";	}
		else if( score >= 85 )
		{	grade = "A";	}
		else if( score >= 75 )
		{	grade = "B";	}
	    else if( score >= 65 )
		{	grade = "C";	}
		else if( score >= 50 )
		{	grade = "D";	}
		else if( score < 50 )
		{	grade = "F";	}
		return grade;
/*
85-100 / A
75-84 / B
65-74 / C
50-64 / D
<50 / F
*/
	}


	public static String[] calculate(int[][] scores)
	{	// calculate the average for each student, then
		// convert it to a letter grade with scoreToGrade method
		// and put result into a 3rd parallel array (String)
        double average, sum;
        String[] output = new String[scores.length];
        for(int s = 0; s < scores.length; s++)
        {   sum = 0;
            for(int t = 0; t < scores[s].length; t++)
            {   sum = sum + scores[s][t];
            }
            average = sum / scores[s].length;
            output[s] = scoreToGrade(average);
        }
        return output;
	}


	public static double classAverage(int[][] scores)
	{	// calculate the class average
        double average = 0; // class average
        double sum = 0; // to add the scores of each student
        // scores.length = number of rows (1 per students)
        // scores[x].length = number of columns (1 per score)
        for(int s = 0; s < scores.length; s++) // for each student
        {   sum = 0; // reset sum of scores for each student
            for(int t = 0; t < scores[s].length; t++) // for each score
            {   sum = sum + scores[s][t];
            }
            double studenAverage = (sum / scores[s].length);
            average = average + studenAverage;
        }
        return average / scores.length;
	}


	public static void printMarkBook(String[] names, int[][] scores, String[] results)
	{
		String tab = "\t";
		int classSize = scores.length;  // or names.length(), which should be the same
		System.out.println("\nMarkbook\n========\n");
		for(int s = 0; s < classSize; s++)
		{
			int tests = scores[s].length; // number of tests/scores per student
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
		String[] students = { "Able", "Adam", "Alan", "Geoff", "Jon", "Karl",
							  "Keane", "Louie", "Michael", "Selina" };

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

		String[] grades = calculate(testScores);

		printMarkBook(students, testScores, grades);

	} // end main

} // end class

