package ExerciciosMatrizeseVetores;

import java.util.Scanner;

public class ExercicioVetor01 {

	public static void main(String[] args) {
		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
		
		short atividade[] = new short [5];
		short p, maior=0;
		Scanner ler = new Scanner(System.in);
		
		for (p=0;p<5;p++)
		{
			System.out.print("Por favor, digite a pontuação de cada atividade:");
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
		System.out.print("\nA maior pontuação é:"+maior);
	}
}
