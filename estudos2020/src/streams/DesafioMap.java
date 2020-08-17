package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Consumer<Integer> println = System.out::println;
	
		/*
		 * 1. Número para string binaria... 6 => "110" 
		 * 2. Inverter a string ... "110" => "011"
		 * 3. Converter de volta para inteiro => "110" = >3
		 * 
		 */

		Function<Integer, String> numeroParaStringBinaria =
				n -> Integer.toBinaryString(n); 
		
		
		UnaryOperator<String> inverteString =
				s -> new StringBuilder(s).reverse().toString();
		
		
		Function<String, Integer> binarioParaInt =
						n -> Integer.parseInt(n, 2); 
				
		System.out.print("\n\nDesafio MAP - Solução 1 ...\n");
		
		nums.stream()
		.map(numeroParaStringBinaria)
		.map(inverteString)
		.map(binarioParaInt) 
		.forEach(println);		
		
		
		//Outra opção seria
		System.out.print("\n\nDesafio MAP - Solução 2 ...\n");		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverteString)
		.map(binarioParaInt) 
		.forEach(println);	
		
		
	}
}
