package Aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.FuncionarioTerceirizado;

public class Empresa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("|               Pagamento de Funcionários               |");
		System.out.print("Entre com o número de funcionários: ");
		int qtdFuncionarios = teclado.nextInt();

		for (int i = 1; i <= qtdFuncionarios; i++) {
			System.out.print("Funcionário terceirizado (S/N)? ");
			char ch = teclado.next().charAt(0);
			System.out.print("Nome: ");
			teclado.nextLine();
			String nome = teclado.nextLine();
			System.out.print("Horas trabalhada: ");
			int horas = teclado.nextInt();
			System.out.print("Valor por Hora R$");
			double valorPorHora = teclado.nextDouble();
 
			if (ch == 'S') {
				System.out.print("Adicional: ");
				double adicional = teclado.nextDouble();
				list.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, adicional));
			}

			else {
				list.add(new Funcionario(nome, horas, valorPorHora));
			}

		}
		System.out.println();
		System.out.println("============= PAGAMENTOS =============");
		for (Funcionario fun : list) {
			System.out.println(fun.getNome() + " : R$  "+ String.format("%.2f", fun.pagamento()));
		}

		teclado.close();
	}

}
