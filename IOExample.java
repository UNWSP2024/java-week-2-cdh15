import java.util.Scanner;
public class IOExample {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		String s;  // variable type string
		int n;     // variable type integer
		double x;  // variable type double precision decimal with 15 digit precision
		
		System.out.print("Enter a String -->");
		s = userinput.nextLine();
		System.out.println("You typed is :" + s);
		
		System.out.print("Enter an Integer -->");
		n = userinput.nextInt();
		System.out.println("You typed is :" + n);
		
		System.out.print("Enter a Decimal -->");
		x = userinput.nextDouble();
		System.out.println("You typed in :" + x);
		
		s = userinput.nextLine();
		//Convert from Binary
		System.out.print ("Enter a Binary -->");
		s = userinput.nextLine();
		n = Integer.parseInt(s,2);
		System.out.println ("As an integer this is :" + n);
		
		//Convert to Binary
		System.out.print ("Enter an Integer -->");
		n = userinput.nextInt();
		s = Integer.toBinaryString(n);
		System.out.println ("As a binary this is :" + s);
		
		s = userinput.nextLine();
		
		//Convert from Hexadecimal
		System.out.print("Enter a Hexadecimal -->");
		s = userinput.nextLine();
		n = Integer.parseInt(s,16);
		System.out.println("As an integer this is :" + n);
		
		//Convert to Hexadecimal
		System.out.print("Enter an Integer -->");
		n = userinput.nextInt();
		s = Integer.toHexString(n);
		System.out.println("As a hexadecimal this is :" + s);
	}
}
