import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int numberOfTests = input.nextInt();

		while (numberOfTests-- > 0) {
			Train train = new Train();
			train.setLength(input.nextInt());
			train.setTrains(train.nextIntArray());
			train.sort();

			System.out.println("Optimal train swapping takes " + train.getTotalSwaps() + " swaps.");
		}
	}

	private static class Train {
		private int totalSwaps = 0;
		private int length = 0;
		private int[] trains;

		private int[] nextIntArray() {
			int[] array = new int[length];

			for (int i = 0; i < length; i++) {
				array[i] = input.nextInt();
			}
			return array;
		}

		private void sort() {
			int length = trains.length;
			for (int i = 0; i < length; i++) {
				int swaps = 0;

				for (int j = 0; j < length - 1; j++) {
					if (trains[j] > trains[j + 1]) {
						int tmp = trains[j];
						trains[j] = trains[j + 1];
						trains[j + 1] = tmp;
						swaps++;
						totalSwaps++;
					}
				}
				if (swaps == 0) {
					break;
				}
			}
		}

		public int getTotalSwaps() {
			return totalSwaps;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public void setTrains(int[] trains) {
			this.trains = trains;
		}
	}
}