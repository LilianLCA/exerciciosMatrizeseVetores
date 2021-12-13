package ExerciciosMatrizeseVetores;

import java.util.Scanner;

public class ExercicioMatriz02 {

	public static void main(String[] args) {
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.*/
		
		
		short linha, coluna, soma=0;
		short mat[][] = new short [3][3];
		Scanner ler = new Scanner (System.in);

		for (linha=0;linha<3;linha++)
		{
			for (coluna=0;coluna<3;coluna++)
			{
				System.out.println("Por favor, digite um número:");
				mat[linha][coluna]= ler.nextShort();
			}
		}

		for (linha=0;linha<3;linha++)
		{
			for (coluna=0;coluna<3;coluna++)
			{
				System.out.printf("\t", mat[linha][coluna]);
			}
		}
				
		for (linha=0;linha<3;linha++)
		{
			for (coluna=0;coluna<3;coluna++)
			{
				soma= (short) ((mat[linha][coluna]) + soma);
			}		
		}

		System.out.printf("\nA soma dos valores é:"+ soma);
		{
			for (linha=0;linha<3;linha++)
			{
				for (coluna=0;coluna<3;coluna++) 
				{
					soma = (short) (mat[0][0] + mat[1][1] + mat[2][2]); 
				}	
			}

			System.out.println("\nA soma dos valores da primeira diagonal principal é:"+ soma);
		}
	}
}
