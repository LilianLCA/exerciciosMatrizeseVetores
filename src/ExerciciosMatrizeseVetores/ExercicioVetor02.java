package ExerciciosMatrizeseVetores;

import java.util.Scanner;

public class ExercicioVetor02 {

	public static void main(String[] args) {
		/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		quantas foram as ocorr�ncias da maior pontua��o.*/
		
		
		byte dado[] = new byte [10];
		byte lanc, maior=0, soma=0, media=0;
		Scanner ler = new Scanner(System.in);
		
		for (lanc=0;lanc<10;lanc++)
		{
			System.out.println("Por favor, digite os valores correspondentes aos lan�amentos do dado:");
			dado[lanc] = ler.nextByte();
		}
		
		for (lanc=0;lanc<10;lanc++)
		{
			soma= (byte) (soma+dado[lanc]);
			media= (byte) (soma/10);
		}
		System.out.println("A m�dia dos lan�amentos �:"+media);
		
		for (lanc=0;lanc<10;lanc++)
		{
			if (dado[lanc]==6)
			{
				maior++;
			}
		}
		System.out.println("\nQuantas vezes aparece a maior pontua��o? "+ maior);
	}	

}
