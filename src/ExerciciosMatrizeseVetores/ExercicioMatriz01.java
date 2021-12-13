package ExerciciosMatrizeseVetores;

//import java.util.Scanner;

public class ExercicioMatriz01 {

	public static void main(String[] args) {
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria: a) Uma
		 * matriz M1 cujos elementos serão as somas dos elementos de mesma posição das
		 * matrizes N1 e N2; b) Uma matriz M2 cujos elementos serão as diferenças dos
		 * elementos de mesma posição das matrizes N1 e N2.
		 */

		int N1[][] = { { 1, 2, 3, 4, 5, 6 }, { 6, 5, 4, 3, 2, 1 }, { 1, 2, 3, 4, 5, 6 }, { 6, 5, 4, 3, 2, 1 } };
		int N2[][] = { { 20, 22, 23, 24, 25, 26 }, { 26, 25, 24, 23, 22, 21 }, { 20, 22, 23, 24, 25, 26 }, { 26, 25, 24, 23, 22, 21 } };
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		int x, y;

		for (x = 0; x < 4; x++) {
			for (y = 0; y < 6; y++) {
				M1[x][y] = (N1[x][y] + N2[x][y]);
				M2[x][y] = (N1[x][y] - N2[x][y]);
			}
		}

		for (x = 0; x < 4; x++) {
			for (y = 0; y < 6; y++) {
				System.out.printf("\t" + M1[x][y]);
			}
			System.out.println("\n");
		}

		for (x = 0; x < 4; x++) {
			for (y = 0; y < 6; y++) {
				System.out.printf("\t" + M2[x][y]);
			}
			System.out.println("\n");
		}
	}
}

