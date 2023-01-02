import java.util.*;

class QN1
{
	static String removeDuplicate(char str[], int n)
	{
		
		int num = 0;

		for (int i = 0; i < n; i++)
		{

		
			int j;
			for (j = 0; j < i; j++)
			{
				if (str[i] == str[j])
				{
					break;
				}
			}

			
			if (j == i)
			{
				str[num++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, num));
	}


	public static void main(String[] args)
	{
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter a String");
		String st = ch.nextLine();
		char str[] = st.toCharArray();
		int n = str.length;
		System.out.println(removeDuplicate(str, n));
	}
}


