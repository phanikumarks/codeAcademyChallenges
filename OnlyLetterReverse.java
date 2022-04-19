import java.util.Arrays;
import java.util.Scanner;
 
class OnlyLetterReverse
{
 
// Function that returns the string s
// in sorted form such that the
// positions of alphabets and numeric
// digits remain unchanged
static String sort(String s)
{
    char []c = new char[s.length() + 1];
 
    // String to character array
    c = s.toCharArray();
 
    // Sort the array
    Arrays.sort(c);
 
    // Count of alphabets and numbers
    int al_c = 0, nu_c = 0;
 
    // Get the index from where the
    // alphabets start
    while (c[al_c] < 97)
        al_c++;
 
    // Now replace the string with sorted string
    for (int i = 0; i < s.length(); i++)
    {
 
        // If the position was occupied by an
        // alphabet then replace it with alphabet
        if (s.charAt(i) < 97)
            s = s.substring(0,i)+ c[nu_c++]+s.substring(i+1);
 
        // Else replace it with a number
        else
            s = s.substring(0,i)+ c[al_c++]+s.substring(i+1);
    }
 
    // Return the sorted string
    return s;
}
 
// Driver code
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string : ");
	
    String s = sc.nextLine();
 
    System.out.println(sort(s));
}
}