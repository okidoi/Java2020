package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados =  Arrays.asList("Marcia", "Pedro", "Jo�o", "Tereza", "Fernando");
		
		System.out.println("------------------------------");
		System.out.println("Usando o foreach");
		for(String nome: aprovados){
			System.out.println(nome);
		}
		
		
		System.out.println("------------------------------");
		System.out.println("\nUsando Iterator");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------------------------------");
		System.out.println("\nUsando Streams");
		//Stream tamb�m � uma lista/conjunto de objetos e a intera��o ocorre de forma interna
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);  //La�o interno
		
		
		
	}
}
