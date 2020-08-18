package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;


//Reduce é uma funcao TERMINADORA. O resultado final não pode mais ser tratado. 

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;
		
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		
		
		//Cuidado:
		Integer total2 = nums.parallelStream().reduce(0, soma);  //Caso o valor de acumulador seja diference de 0 (zero) teremos efeito colateral em parallelStream, pois cada um dos elementos ira somar 100.
		System.out.println(total2);
		
		
		//Resultado foi um Optional<Integer> ...
		nums.stream()
			.filter(n-> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
		
	}
}
