package lambdas2;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		// A seguencia é : execute a funcao (maisDois) depois a (vezesDois) depois a (aoQuadrado) sobre o valor zero
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		System.out.println(resultado1);
		
		
		//Compose é ao contrário. 
		//Então... devo inverter a ordem. (pra ficar.. antes de executar o Quadrado execute o vezesDois. 
		//E antes de executar o vezesDois execute o maisDois
		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		
		System.out.println(resultado2);
	}
}
