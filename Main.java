import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 1; i < 10001; i++) {
			map.put(i, divisors(i));
		}

		int tmpVal;
		int sum = 0;

		for (int i = 1; i < 10001; i++) {
			if (map.containsKey(i)) {
				tmpVal = map.get(i);
				if (map.containsKey(tmpVal) && map.get(tmpVal) == i
						&& i != tmpVal) {
					sum = sum + i + tmpVal;
					map.remove(tmpVal);
				}
			}
		}

		System.out.println(sum);
	}

	public static int divisors(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}
}