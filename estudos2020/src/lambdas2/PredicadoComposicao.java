package lambdas2;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		//No predicado trabalhamos com operações Lógicas (E, OU, NEGACAO)
		Predicate<Integer> isPar = num -> num % 2 == 0;
		
		Predicate<Integer> isTresDigitos = num -> (num >= 100 && num <= 999);
		
		System.out.println("Teste se numero é par");
		System.out.println(isPar.test(5));
		System.out.println(isPar.test(10));
		System.out.println("");
		//
		System.out.println("Teste se numero possui 3 digitos");
		System.out.println(isTresDigitos.test(23));
		System.out.println(isTresDigitos.test(100));
		System.out.println(isTresDigitos.test(1000));
		System.out.println(isTresDigitos.test(200));		
		System.out.println("");
		

		//Posso concatenar 2 metodos. Ou seja, tem que ser par e tem que ter 3 digitos
		System.out.println("Teste se numero é par E possui 3 digitos");
		System.out.println("é par e tem 3 digitos?: "+  isPar.and(isTresDigitos).test(224));
		System.out.println("");		
		
		System.out.println("Teste se numero é par OU possui 3 digitos");
		System.out.println("é par ou tem 3 digitos?: "+  isPar.or(isTresDigitos).test(24));
		System.out.println("");		
		
		System.out.println("Teste se numero é par OU possui 3 digitos - NEGANDO O VALOR");
		System.out.println("é par ou tem 3 digitos?: "+  isPar.or(isTresDigitos).negate().test(24));

		
		
	}

}
