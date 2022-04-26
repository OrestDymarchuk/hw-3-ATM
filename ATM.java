public class ATM {

	public static int countBanknotes(int sum) {
		int[] notes = new int[] { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int[] noteCounter = new int[9];
		int amount = 0;
		int i = 0;

		while (i < 9) {
			if (sum >= notes[i]) {
				noteCounter[i] = sum / notes[i];
				sum -= noteCounter[i] * notes[i];
			}
			i++;
		}

		i = 0;
		while (i < 9) {
			if (noteCounter[i] != 0) {
				amount += noteCounter[i];
			}
			i++;
		}
		return amount;
	}

	public static void main(String[] args) {

		// 6 (500 + 50 + 20 + 5 + 2 + 1
		int sum = 578;
		System.out.print(ATM.countBanknotes(sum));
	}
}
