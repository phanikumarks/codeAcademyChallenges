import java.util.Scanner;

public class StringToHex {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("The string is : ");
        String stringToConvert = sc.nextLine();

        convertStringToHex(stringToConvert);
    }

    private static void convertStringToHex(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            String charToHex = Integer.toHexString(c);
            stringBuilder.append(charToHex);
        }

        System.out.println("Converted Hex from String: "+stringBuilder.toString());
    }
}