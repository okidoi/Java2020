package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("João", 4.8);
		Aluno a3 = new Aluno("Rafael", 8.8);
		Aluno a4 = new Aluno("Marcio", 7.2);
		Aluno a5 = new Aluno("Rebeca", 3.8);
		Aluno a6 = new Aluno("Pedro", 9.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Function<Aluno, String> saudacaoAprovado =
				a -> "Parabens " + a.nome + "! Você foi aprovado(a)";
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);

	}
	
	
	
}
