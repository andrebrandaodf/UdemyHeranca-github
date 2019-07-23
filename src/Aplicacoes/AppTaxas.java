package Aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Contribuente;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;

public class AppTaxas {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.println("============== TAXAS ==============");

		List<Contribuente> list = new ArrayList<>();

		System.out.print("Digite o número de contribuentes: ");
		int cont = tc.nextInt();

		for (int i = 1; i <= cont; i++) {

			System.out.println("Taxa pagadora #" + i + " dados: ");
			System.out.print("Pessoa Física ou Juridica (F/J)?");
			char tipo = tc.next().charAt(0);
			System.out.print("Nome: ");
			tc.nextLine();
			String nome = tc.nextLine();
			System.out.print("Rendimento Anual R$ ");
			Double rendimentoAnual = tc.nextDouble();
			if (tipo == 'F') {
				System.out.print("Despesas com saúde: ");
				Double despesaComSaude = tc.nextDouble();
				list.add(new PessoaFisica(nome, rendimentoAnual, despesaComSaude));
			} 
			else {
				System.out.print("Número de empregados: ");
				int qtdFuncionarios = tc.nextInt();
				list.add(new PessoaJuridica(nome, rendimentoAnual, qtdFuncionarios));
			}

		}
		
		double soma = 0.0;
		System.out.println();
		System.out.println("Taxas Pagas: ");
		for(Contribuente contrib: list) {
			double taxa = contrib.taxa();
			System.out.println(contrib.getNome()+ ": R$ " + String.format("%.2f", taxa));
			soma += taxa;
		}
		
		System.out.println();
		System.out.println("Valor total das Taxas: R$ " + String.format("%.2f", soma));
		
		tc.close();
	}

}
