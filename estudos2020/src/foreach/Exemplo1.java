package foreach;

import java.util.Arrays;
import java.util.List;

public class Exemplo1 {
	
	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("Pedro", "Paulo", "João", "Maria", "Homero");		
		lista.forEach(System.out::println);		
		
	}

}
