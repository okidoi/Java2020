package lambdas2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		//Defino meu consumidor e o seu comportamento (Consumers recebem parametro mas não devolvem nada. Elas consomem o valor)
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");
		
		
		Produto p1 = new Produto("Caneta", 10.20, 0.09);
		
		imprimirNome.accept(p1);
		
		
		Produto p2 = new Produto("Lapis", 1.20, 0.10);
		Produto p3 = new Produto("Caderno", 20.20, 0.30);
		Produto p4 = new Produto("Borracha", 0.20, 0.25);
		Produto p5 = new Produto("Apontador", 3.20, 0.19);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		
		produtos.forEach(p->System.out.println(p.preco));
		produtos.forEach(System.out::println); //assim ele chama o toString da classe Produto
		
		
	}
}
