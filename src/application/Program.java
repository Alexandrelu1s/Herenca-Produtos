package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Produto produto;
		List<Produto> produtos = new ArrayList<>();
		
		System.out.print("Numero de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Produto #" + (i+1));
			System.out.print("Local, usado ou importado (L, U, I)? ");
			char r = sc.next().toUpperCase().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Preço: R$ ");
			Double preco = sc.nextDouble();
			
			if(r == 'L') {
				produto = new Produto(nome, preco);
				produtos.add(produto);
			}
			
			if(r == 'U') {
				System.out.print("Informe a data de fabricação: ");
				Date data = sdf.parse(sc.next());
				produto = new ProdutoUsado(nome, preco, data);
				produtos.add(produto);
			}
			
			if(r == 'I') {
				System.out.print("Informe o valor da taxa: ");
				Double taxa = sc.nextDouble();
				produto = new ProdutoImportado(nome, preco, taxa);
				produtos.add(produto);
			}
		}
		
		System.out.println("Lista de produtos:");
		for(Produto p : produtos) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
