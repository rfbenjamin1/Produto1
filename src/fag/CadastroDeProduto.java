package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDeProduto {

	
	
	public static void main(String[] args) {
	int escolhaUsuario=0;	
		
	Scanner scan = new Scanner (System.in);
	List <Produtos>	ListaDeProdutos = new ArrayList<Produtos>();
		
		
	while(escolhaUsuario != 3) {	
		System.out.println(" Escolha uma opção: ");
		System.out.println(" [1] Cadastrar novo produto: ");
		System.out.println(" [2] Ver produtos na lista:: ");
		System.out.println(" [3] Sair: ");
		escolhaUsuario = scan.nextInt();

		if(escolhaUsuario == 1) {
			System.out.println("Digite o nome do produto: ");
				String nome = scan.next();
			System.out.println("Digite o preço do produto: ");
				double preco = scan.nextDouble();
			System.out.println("Digite a quantidade de produto: ");
				int quantidade = scan.nextInt();
			Produtos item = new Produtos(nome , preco, quantidade);
			ListaDeProdutos.add(item);
		}
		
		if(escolhaUsuario == 2) {
			for (Produtos todoProduto : ListaDeProdutos) {
				System.out.println(todoProduto);
			}
		}

}
		
		
 }
}