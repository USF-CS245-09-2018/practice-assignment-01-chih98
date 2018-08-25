public class FibonacciRecursive implements Fibonacci {

	public int fibonacci(int n) {

		// following google doc, ignoring implementation
		if (n < 2) {

			return n;

		}

		return fibonacci(n - 1) + fibonacci(n - 2);

	}

}