import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int numberOfTests = input.nextInt();

		while (numberOfTests-- > 0) {
			int numberOfBaseAddresses = input.nextInt();
			int numberOfKeys = input.nextInt();
			List<BaseAddress> hashTable = getListOfBaseAddresses(numberOfBaseAddresses);

			// Get keys and push them into hashTable by address
			for (int i = 0; i < numberOfKeys; i++) {
				int key = input.nextInt();
				int address = key % numberOfBaseAddresses;

				hashTable.get(address).addValue(key);
			}

			// Output
			for (BaseAddress baseAddress : hashTable) {
				List<Integer> keys = baseAddress.getValues();
				
				System.out.print(baseAddress.getBase() + " -> ");
				for (Integer key : keys) {
					System.out.print(key + " -> ");
				}
				System.out.println("\\");
			}

			if (numberOfTests != 0)
				System.out.println("");
		}
	}

	private static List<BaseAddress> getListOfBaseAddresses(int numberOfAddresses) {
		List<BaseAddress> hashTable = new ArrayList<>(numberOfAddresses);

		for (int address = 0; address < numberOfAddresses; address++) {
			hashTable.add(new BaseAddress(address));
		}
		return hashTable;
	}

	private static class BaseAddress {
		private int adress;
		private List<Integer> values;

		BaseAddress(int base) {
			this.adress = base;
			values = new ArrayList<>();
		}

		public void addValue(int value) {
			values.add(value);
		}

		public List<Integer> getValues() {
			return values;
		}

		public int getBase() {
			return adress;
		}
	}
}