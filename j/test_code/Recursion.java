package test_code;

public class Recursion {
	public int recursion(int n){
		if (n == 1)
			return 1;
		else
			return n * recursion(n - 1);
	}

	public static void main(String[] args) {
		Recursion r = new Recursion();
		int n = r.recursion(3);
		System.out.println(Integer.toString(n));
	}
}
