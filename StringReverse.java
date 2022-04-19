import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String : ");
			String str = sc.nextLine();
			String rev = "";
			
			System.out.println("String before reversing : "+str);
			
			for(int i=str.length()-1; i >= 0;  i--) 
			{
				
				rev += str.charAt(i);
				
			}
		
		
		System.out.println("String after reversing is :"+ rev);
		
		
	}

}
