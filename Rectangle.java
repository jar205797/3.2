import java.util.Scanner;


public class Rectangle {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);
	double L = 0.0;
	double W = 0.0;
	   	    double P = 0.0;
	   	    double A = 0.0;
	   	    System.out.print("Please enter the length of the rectangle: ");
	            L = keyboard.nextDouble();
	            System.out.print("Please enter the width of the rectangle: ");
	            W = keyboard.nextDouble();
	            P = 2*(L+W);
	            A = L*W;
		    System.out.println("The permimeter of the unit rectangle is " + P);
		    System.out.println("and the area of the rectangle is " + A);
		}
}

