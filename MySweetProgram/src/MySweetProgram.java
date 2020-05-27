import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		System.out.println("Enter you're name");
		//comment
		Scanner in = new Scanner (System.in);
		//String s = in.nextLine();
		
		
		int i = 0; //initialization
		
		do { 
			System.out.println("i is: " + i);
			i++;
		} while(i < 10);
		
		
		
		in.close();
	}
}