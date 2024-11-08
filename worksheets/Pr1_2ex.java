class Pr1_2ex // 1.2
{
	public static void main(String[] args)
	{
		int number = IBIO.inputInt("enter starting number: ");
		for (int i = 0; i < 20; i++)
		{
			IBIO.output(number);
			number = number + 7;
		}
	}
}

// Output:
// 
// enter starting number: 3
// 3
// 10
// 17
// 24
// 31
// 38
// 45
// 52
// 59
// 66
// 73
// 80
// 87
// 94
// 101
// 108
// 115
// 122
// 129
// 136