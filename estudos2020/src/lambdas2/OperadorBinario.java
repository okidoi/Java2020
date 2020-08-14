package lambdas2;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media =
				(Double n1, Double n2) -> (n1 + n2) / 2;  //Posso retirar a declara��o do tipo dos parametros Double, ficando somente os parametros.
		
		System.out.println("Usando Operador Binario - trabalham com um �nico tipo");
		System.out.println("M�dia: "  + media.apply(9.8, 5.7));

	
		//BiFunction<T, U, R> onde o T e o R s�o tipos de entrada e R o tipo de retorno
		System.out.println("Usando Operador BiFunction - trabalham com um tipo de entrada e outro diferente de saida");
		BiFunction<Double, Double, String> resultado =  (n1, n2) -> {
			double notaFinal = (n1 + n2)/2;
			return notaFinal >= 7 ? "Aprovado": "Reprovado";
		};
		
 		System.out.println("Resultado: " + resultado.apply(9.8, 5.7));
	
 		
 		
 		Function<Double, String> conceito =
 				m -> m >= 7? "Aprovado": "Reprovado";

 		System.out.println("Usando composi��o: " + media.andThen(conceito).apply(9.8, 5.7));
 		
 		
 		
	}

	
}
