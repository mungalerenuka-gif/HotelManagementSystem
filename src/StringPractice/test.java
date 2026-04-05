package StringPractice;

public class test {

	public static void main(String[] args) {
		int num = 9474;
		int extra = num;
		int raise = 0;
		int sum = 0;

		while (extra != 0) {
			extra = extra / 10;
			raise++;
		}

		extra = num;
		while (extra > 0) {
			int indivisual = extra % 10;
			sum = sum + (int) Math.pow(indivisual, raise);
			extra = extra / 10;
		}

		if (sum == num) {
			System.out.println("This is a armstrong number");
		} else {
			System.out.println("This is not a armstrong");
		}
	}
}