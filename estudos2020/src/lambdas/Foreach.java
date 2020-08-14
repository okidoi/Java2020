package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Formula tradicional....");

		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01....");
		aprovados.forEach(nome->{System.out.println(nome + " foi aprovado!!!");});  // opção 1
		
		System.out.println("\nLambda #02....");		
		aprovados.forEach(nome->System.out.println(nome + " foi aprovado!!!"));  	// opção 2
		
		System.out.println("\nLambda #03 [Method Reference]....");		
		aprovados.forEach(System.out::println);  									// opção 3 ( a mais estranha de todas)
		//Em outras palavras o forEach recebe uma referencia para o método println e 
		//o forEach então manda cada um dos seus elementos para o método. 
		//No Method Reference não é tão flexivel pois não consigo concatenar mais nada aos valores passados

		
		System.out.println("\nLambda #04 [Meu Method Reference]....");
		aprovados.forEach(nome->meuImprimir(nome));  	
		
		//Agora vou passar uma referencia para uma funcao que eu criei
		System.out.println("\nLambda #05 [Meu Method Reference 2]....");
		aprovados.forEach(Foreach::meuImprimir);  	
		
	}
	
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
