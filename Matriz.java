package classes;
import java.util.Scanner;

public class Matriz {
	
	private int[][]mat;
	Scanner sc = new Scanner(System.in);
	
	public Matriz(int lin, int col) {
		this.mat = new int [lin][col];
	}
	
	public void lerMatriz(String M) {
		System.out.println("Entre com os elementos da Matriz " + M);
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				this.mat[i][j] = sc.nextInt();
			}
		}
	}
	
	public void imprimirMatriz(String M) {
		System.out.println("Matriz " + M);
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < (mat[i].length - 1); j++) {
				System.out.print(this.mat[i][j] + " ");
			}
			System.out.print(this.mat[i][mat[i].length - 1] + "\n");
		}
	}
	
	public int somarElementosMatriz() {
		int soma = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				soma += this.mat[i][j];
			}
		}
		return soma;
	}
	
	public void somarMatrizes(Matriz M) {
		Matriz C = new Matriz(M.mat.length, M.mat[0].length);
		if(this.mat.length == M.mat.length && this.mat[0].length == M.mat[0].length) {
			for(int i = 0; i < mat.length; i++) {
				for(int j = 0; j < mat[i].length; j++) {
						C.mat[i][j] = this.mat[i][j] + M.mat[i][j];
				}
			}
			C.imprimirMatriz("C");
		}else {
			System.out.println("Dimensões diferentes das Matrizes.");
		}
	}
	
	public void subtrairMatrizes(Matriz M, Matriz N) {
		Matriz C = new Matriz(M.mat.length, M.mat[0].length);
		if(N.mat.length == M.mat.length && N.mat[0].length == M.mat[0].length) {
			for(int i = 0; i < N.mat.length; i++) {
				for(int j = 0; j < N.mat[i].length; j++) {
						C.mat[i][j] = M.mat[i][j] - N.mat[i][j];
				}
			}
			C.imprimirMatriz("C");
		}else {
			System.out.println("Dimensões diferentes das Matrizes.");
		}
	}
	
	
}