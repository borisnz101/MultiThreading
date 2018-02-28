package Question2;

public class ComputingThread implements Runnable {

	int number;
	static int arrayList[];

	public ComputingThread(int number) {
		this.number = number;
	}

	public ComputingThread() {

	}

	public void run() {

		arrayList = new int[number];
		int j = 0;

		for (int i = 0; i < number; i++) {

			if (j == 0 || j == 1) {

				arrayList[0] = 0;
				arrayList[1] = 1;
				j++;

			} else {

				arrayList[j] = arrayList[j - 1] + arrayList[j - 2];
				j++;
			}
		}

	}

	public int[] transferData() {

		return arrayList;
	}

}
