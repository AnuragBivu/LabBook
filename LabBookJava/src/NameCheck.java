import java.util.Scanner;

public class NameCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First name of the Employee");
		String fname = scan.nextLine();
		System.out.println("Enter the Second name of the employee");
		String lname = scan.nextLine();
		System.out.println(fname + " " + lname);

		try {
			if (isNull(fname) && isNull(lname)) {
				System.out.println("The name is blank");
				
			} else {
				System.out.println("Name is ok");
			}
		} catch (NameBlankException e) {
	
			e.printStackTrace();
		}

		System.out.println(fname + " " + lname);
	}

	public static boolean isNull(String str) throws NameBlankException {
		if (str == null)
			return false;
		else
			throw new NameBlankException();

	}
}

class NameBlankException extends Exception {
	NameBlankException() {
		super("The name is blank ");
	}
}
