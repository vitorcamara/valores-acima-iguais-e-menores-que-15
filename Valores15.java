package com.vitorcamara.projetos;

import java.util.Scanner;

public class Valores15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int somaInferior15 = 0;
		int qtdIguais15 = 0;

		double somaSuperior15 = 0;
		int qtdSuperior15 = 0;

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do indice " + i + ":");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] < 15) {
				somaInferior15 += vetorA[i];
			} else if (vetorA[i] == 15) {
				qtdIguais15++;
			} else if (vetorA[i] > 15) {
				qtdSuperior15++;
				somaSuperior15 += vetorA[i];
			}
		}

		double mediaSuperior15 = somaSuperior15 / qtdSuperior15;

		System.out.println("Soma dos valores inferiores a 15 = " + somaInferior15);
		System.out.println("Quantidade de valores iguais a 15 = " + qtdIguais15);
		System.out.println("Media dos valores superiores a 15 = " + mediaSuperior15);

	}

}
