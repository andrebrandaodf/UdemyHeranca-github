package Aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;

public class CasasBahia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		System.out.println("----------------------- Casas Bahia -----------------------");
		System.out.println("Entre com números de produtos: ");
		int qtdProdutos = tc.nextInt();
		
		List <Produto> list = new ArrayList<>();
		
		for (int i=1; i<=qtdProdutos; i++) {
			System.out.println("Poduto #"+i+" :" );
			System.out.print("Comum, Usado ou Importado (C/U/I) ? " );
			char ch = tc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = tc.next();
			System.out.print("Preço R$ ");
			float preco = tc.nextFloat();
			System.out.println("Taxa Alfandegária: ");
			float taxa = tc.nextFloat();
			System.out.println("Data de fabricação (DD/MM/YYYY): ");
			
			
			
		}
		
		
		
		
		
		tc.close();
		
	}

}
