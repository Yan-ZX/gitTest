import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	public static List<Integer> factorsOf(int n){
		ArrayList<Integer> factors = new ArrayList<>();
		int divisor = 2;
		while (n > 1){
			while (n % divisor == 0){
				factors.add(divisor);
				n /= divisor;
			}
			divisor++;
		}
		return factors;
	}

	public static void main(String[] args) {
		List e = factorsOf(10);
		System.out.println(e);
	}
}
