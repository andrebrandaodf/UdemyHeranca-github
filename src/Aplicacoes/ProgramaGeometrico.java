package Aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Circulo;
import Entidades.Color;
import Entidades.Forma;

public class ProgramaGeometrico {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);

		List<Forma> list = new ArrayList<>();

		System.out.println("Digite o nº de formas gométricas: ");
		int qtd = tc.nextInt();

		for (int i = 1; i <= qtd; i++) {
			System.out.println("Forma #" + i + " data: ");
			System.out.println("Retangulo ou Círculo (R/C)? ");
			char ch = tc.next().charAt(0);
			System.out.println("Cores (PRETO/AZUL/VERMELHO): ");
			Color color = Color.valueOf(tc.next());
			if (ch == 'R') {
				System.out.println("Largura: ");
				double largura = tc.nextDouble();
				System.out.println("Altura: ");
				double altura = tc.nextDouble();

			}
			else {
				System.out.println("Raio: ");
				double raio = tc.nextDouble();
				list.add(new Circulo(color, raio));
			}
			
			System.out.println();
			System.out.println("Areas: ");
			for(Forma forma : list) {
				System.out.println(String.format("%.2f", forma.area()));
			}
			
		}

		tc.close();

	}
}
