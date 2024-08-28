import java.text.NumberFormat;
import java.util.Scanner;
public class FormattingExample {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		int n = 56; 
		//this will illustrate formatting integers 
		System.out.format ("The integer left justified         : %-10d\n", n);
		System.out.format ("The integer right justified        : %10d\n", n);
	
		double x = -98.735;
		System.out.format ("The double right justified rounded : %10.0f \n", x);
		System.out.format ("The double rounded                 : %.2f \n", x);
		System.out.format ("The double rounded more            : %.8f \n", x);
		System.out.format ("The number as a U.S. currency      : $%.2f\n", x);
		
		System.out.format ("Some random characters             : %c %c %c\n", 189, 209, 230);		
		
		char c = 'w';
		int d = (int)c;  //ASCII value for a character
		String e = Integer.toBinaryString((int)c);  //character converted to binary
		String f = Integer.toHexString((int)c);  //character converted to hex
		System.out.format ("Character right justified          : %4s \n", c);
		System.out.println("Character converted to an integer  : " + d);	
		System.out.println("Character converted to binary      : " + e);
		System.out.println("Character converted to hex         : " + f);
		System.out.println("The ASCII character for 67 is      : " + (char)67);
		
		char g = '干';
		String h = Integer.toHexString((int)g);  //character converted to hex
		System.out.println("A Chinese Character                : " + g);
		System.out.println("Unicode for Chinese Character      : " + h);
		
		char j = '\ub235';  //character in UTF-32  ... needs 4 hex digits
		System.out.println("Printing a Unicode Character       : " + j);
		

	}
}
