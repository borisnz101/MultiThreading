package Question2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Number numberObject = new Number(); // number object to keep the user's entry

		while (true) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter a number :");

			numberObject.setNumber(scanner.nextInt());

			if (numberObject.getNumber() <= 0) {

				System.err.println("the number must be > 0.");
			}

			else {
				scanner.close();
				break;
			}
		}

		Runnable runner = new ComputingThread(numberObject.getNumber());
		Thread thrd = new Thread(runner);

		thrd.start(); // Start the thread to compute the Fibonacci sequence
		try {
			thrd.join(); // wait for the child thread to be done

			ComputingThread result = new ComputingThread(); // object that retrieves the array created by the child
															// thread

			for (int i = 0; i < numberObject.getNumber(); i++) {

				System.out.print("\n" + result.transferData()[i]);
			}

		} catch (InterruptedException ie) {
		}
	}
}
