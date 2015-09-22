
import java.util.Scanner;

public class Username {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String coruser = "jrojas";
		String corpass = "1234";
		String user = "";
		String pass = "";

		System.out.print("Enter username: ");
		user = keyboard.next();

		System.out.print("Enter password: ");
		pass = keyboard.next();

		if (coruser.equals(user) && corpass.equals(pass)) {
			System.out.println("Welcome " + user);
		} else {
			System.out.println("Wrong Username or Password!");
		}

	}

}
