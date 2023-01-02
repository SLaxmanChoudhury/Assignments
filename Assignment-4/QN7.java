import java.util.*;

class QN7
{
	boolean uniqueCharacters(String str)
	{
		
		for (int i = 0; i < str.length(); i++)
			for (int j = i + 1; j < str.length(); j++)
				if (str.charAt(i) == str.charAt(j))
					return false;

		
		return true;
	}

	public static void main(String args[])
	{
		QN7 obj = new QN7();
        Scanner ch = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = ch.nextLine();
	

		if (obj.uniqueCharacters(input))
			System.out.println("The String " + input + " has all unique characters");
		else
			System.out.println("The String " + input + " has duplicate characters");
	}
}
