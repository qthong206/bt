package Exercise;

public class Exercise2 {
	public static int Fib(int n) {
		if (n == 1 || n == 0)
			return 1;
		else {
			return Fib(n - 1) + Fib(n - 2);
		}
	}

	public static int UCLN(int a, int b) {
		int r = a % b;
		if (r == 0)
			return b;
		else
			return UCLN(b, r);
	}

	public static String gameHaNoiTower(int n, String begin, String middle, String end) {
		if (n == 1) {
			return "move from " + begin + " to " + end;
		} else {
			return gameHaNoiTower(n - 1, begin, end, middle) + "\n" +
                "move form " + begin + " to " + end + "\n"
					+ gameHaNoiTower(n - 1, middle, begin, end);
		}
	}

	public static void main(String[] args) {
		System.out.println(Fib(3));
		System.out.println(Fib(5));
		System.out.println(UCLN(5, 10));
		System.out.println(UCLN(12, 18));
		System.out.println(UCLN(12, 17));
		System.out.println(gameHaNoiTower(3, "A", "B", "C"));
	}
}
