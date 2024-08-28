import java.util.Scanner;
public class InputExample {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		int x;
		x = 56; // this illustrates assignment/hard coding
		System.out.println("The assigned number is: " + x);
		
		System.out.print("Enter a Number -->");
		x = userinput.nextInt();  // this illustrates user input
		userinput.nextLine();
		System.out.println("The inputed number is: " + x);

		x = ((int) (Math.random()*100 + 1));  //this illustrates random input
		System.out.println("The random number is: " + x);
	}
}
