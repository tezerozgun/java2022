package javademos;

public class switchDemo {

	public static void main(String[] args) {

		char grade = 'H';

		// case durum demektir.

		switch (grade) {
		case 'A':
			System.out.println("Excellent ");
			break;
		case 'B':
		case 'C':
			System.out.println("Great");
			break;
		case 'D':
			System.out.println("Not bad");
			break;
		case 'E':
			System.out.println("Bad");
			break;
		case 'F':
			System.out.println("Terrible");

		default:
			System.out.println("Invalid");

		}

	}

}
