package Aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;
import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;

public class CasasBahia {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

		System.out.println("----------------------- Casas Bahia -----------------------");
		System.out.print("Digite quantidade de produtos: ");
		int qtdProdutos = tc.nextInt();

		List<Produto> list = new ArrayList<>();

		for (int i = 1; i <= qtdProdutos; i++) {
			System.out.println("Poduto #" + i + " :");
			System.out.print("Comum, Usado ou Importado (C/U/I) ? ");
			char ch = tc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = tc.next();
			System.out.print("Preço R$ ");
			double preco = tc.nextFloat();

			if (ch == 'C') {
				list.add(new Produto(nome, preco));
			}

			else if (ch == 'U') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date dataFabricacao = sdf.parse(tc.next());
				list.add(new ProdutoUsado(nome, preco, dataFabricacao));
			}

			else {
				System.out.print("Taxa Alfandegária: ");
				double taxaAlfandega = tc.nextFloat();
				list.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			}

		}

		System.out.println();
		System.out.println("|            Etiqueta de preços            |");
		for (Produto prod : list) {
			System.out.println(prod.etiquetaDePreco());
		}

		double soma = 0.0;
		for (Produto prod : list) {
			soma += prod.getPreco();
			System.out.print(" Valor total da compra R$ " +soma);
		}

		tc.close();

	}

}
