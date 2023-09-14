package classes;

public class Teste {

	public static void main(String[] args) {
		Matriz A = new Matriz(2,2);
		A.lerMatriz("A");
		A.imprimirMatriz("A");
		System.out.println("Soma dos elementos da Matriz A = "+ A.somarElementosMatriz());
		
		Matriz B = new Matriz(2,2);
		B.lerMatriz("B");
		B.somarMatrizes(A);
		
	}

}