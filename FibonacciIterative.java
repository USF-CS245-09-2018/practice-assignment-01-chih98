public class FibonacciIterative implements Fibonacci {

		public int fibonacci(int n) {

			if (n < 2)
				return 1;

			int prev    = 1;
			int current = 1;

			for (int i = 2; i < n; i++) {

				int temp = current;
				current += prev;
				prev = temp;
			}

			return current;
		}

}