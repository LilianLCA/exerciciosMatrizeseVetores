package ExerciciosMatrizeseVetores;

import java.util.Scanner;

public class ExercicioVetor01 {

	public static void main(String[] args) {
		/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
		atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/
		
		short atividade[] = new short [5];
		short p, maior=0;
		Scanner ler = new Scanner(System.in);
		
		for (p=0;p<5;p++)
		{
			System.out.print("Por favor, digite a pontua��o de cada atividade:");
			atividade[p]= ler.nextShort();
		}
		
		for (p=0;p<5;p++)
		{
			System.out.print(atividade[p]+ "\t");
		}
		
		for (p=0;p<5;p++)
		{
			if (atividade[p]>maior)
			{
				maior=atividade[p];
			}
		}
		System.out.print("\nA maior pontua��o �:"+maior);
	}
}
