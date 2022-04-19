 import java.util.Scanner;
 public class PigLatinExample
 {
 // Method of checking vowels  
 public static Boolean isVowel(char c)
 {
     // handling the case in-sensitivity
     if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' ||
        c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
        // if we reach here, we got a vowel
        return true;
        //if we reach here, we got a consonant
        return false;
 }
 // Method for encoding the input string
 public static String findPigLatin(String input)
 {
     // calculating length of the string
     int size = input.length();
     String pigL = ""; // contains final answer
     int i;
     // loop for finding the first vowel in the string
     for(i = 0; i < size; i++)
     {
         if(isVowel(input.charAt(i)))
         {
             // got the first vowel,
             // getting out of the for-loop
             break;
         }
     }
     // vowels are not present in the input string.
     if( i == size)
     {
         // retuning an empty string
         return "";
     }
     // if we reach here, at least one vowel is present in the input string
     // the first vowel and following letters should come
     // as it is in the encoded string
     pigL = input.substring(i);
     // Appending the letters appearing before
     // the first vowel in the input string
     pigL = pigL + input.substring(0, i - 0);
     // Final step, appeding the string "ay"
     pigL = pigL + "ay";
     // returning the encoded Pig Latin string
     return pigL;
 }
 public static void main(String argvs[])
 {
         String str = ""; // contains the encrypted Pig Latin string
         // Creating an object of the Scanner class
         Scanner scnr = new Scanner(System.in); 
         System.out.println("Enter a string ");
         // reading input given from the user
         str = scnr.nextLine();
         // calling the method findPigLatin() and storing the outcome
         String ans = findPigLatin(str);
         // displaying the result
         if(ans.equals(""))
         {
             System.out.println("The Pig Latin encoded string of the input string " + str + " is not possible");   
         }
         else
         {
             System.out.println("The Pig Latin encoded string of the input string " + str + " is " + ans);
         }
 }
 } 
