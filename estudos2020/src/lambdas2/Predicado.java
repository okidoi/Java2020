package lambdas2;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		//Predicate<Produto> isCaro = prod -> false;  //opção 1 - sem nenhuma avaliacao
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;  //Se o preço for maior que R$750 reais então é caro
		
		Produto produto = new Produto("Notebook", 3893.38, 0.9);
		
		System.out.println("Este produto foi considerado caro? " + isCaro.test(produto));
	}

}
