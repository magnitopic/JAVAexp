package packages.Series;

/**
 * Series
 */
public class Series {

	public static int nSum(int n) {
		int sum=0;
		for(int i=0; i<=n;i++){
			sum+=i;
		}
		return sum;
	}

	public static int factorial(int n) {
		int factorial=0;
		for(int i=0; i<=n;i++){
			factorial*=i;
		}
		return factorial;
	}

	public static int fibonacci(int n) {
		int fibonacci=0;
		for(int i=0; i<=n;i++){
			fibonacci=+(n-i);
		}
		return fibonacci;
	}
}