package exercicios_java_experience;

public class Exercicio17 {
	public static void main(String[] args) {
		int n = 7;
		int numDivisores = 0;
		

		for (int i = 1 ;i<=n;i++) {
			if (n % i == 0) {
				numDivisores++;
			}
			
		}
		if(numDivisores != 2) {
			System.out.println("nao é primo");
		}
		else {
			System.out.println("é primo");
		}
		System.out.println(numDivisores);
				
	}

}
