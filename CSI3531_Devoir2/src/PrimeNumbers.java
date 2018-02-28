import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Number numberObject = new Number();
		
		while (true) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter a number :");
			
			numberObject.setNumber(scanner.nextInt());
			
			if(numberObject.getNumber() < 0) {
				
				System.err.println("the number must be >= 0.");
			}
			
			else {
				scanner.close();
				break;
			}
		}
		
		Runnable runner = new ComputingThread(numberObject.getNumber());
		Thread thrd = new Thread(runner);

		thrd.start();
		}

	}


