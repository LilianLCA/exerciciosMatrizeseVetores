package ExerciciosMatrizeseVetores;

import java.util.Scanner;

public class ExercicioVetor02 {

	public static void main(String[] args) {
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.*/
		
		
		byte dado[] = new byte [10];
		byte lanc, maior=0, soma=0, media=0;
		Scanner ler = new Scanner(System.in);
		
		for (lanc=0;lanc<10;lanc++)
		{
			System.out.println("Por favor, digite os valores correspondentes aos lançamentos do dado:");
			dado[lanc] = ler.nextByte();
		}
		
		for (lanc=0;lanc<10;lanc++)
		{
			soma= (byte) (soma+dado[lanc]);
			media= (byte) (soma/10);
		}
		System.out.println("A média dos lançamentos é:"+media);
		
		for (lanc=0;lanc<10;lanc++)
		{
			if (dado[lanc]==6)
			{
				maior++;
			}
		}
		System.out.println("\nQuantas vezes aparece a maior pontuação? "+ maior);
	}	

}
