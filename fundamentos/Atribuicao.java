package fundamentos;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		System.out.println(c);
		c += b; // c = c + b
		c -= a;
		c *= b;
		c /= a;
		c %= 2;
	}
}
