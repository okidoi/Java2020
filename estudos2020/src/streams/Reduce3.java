package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.0);
		Aluno a2 = new Aluno("Patricia", 4.0);
		Aluno a3 = new Aluno("Lurdes", 6.0);
		Aluno a4 = new Aluno("Pedro", 10);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		
		
		//O acumulador será a Media, o valor de cada um dos elementos será um Double, e o resultado da operação será uma Média também.
		BiFunction<Media, Double, Media> calcularMedia = 
				(media, nota) -> media.adicionar(nota);
		
		BinaryOperator<Media> combinarMedia =
				(m1, m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.parallelStream()
				.filter(aprovado)
				.map(apenasNota)
				.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("A média dos aprovados é : "+  media.getValor());
			
		
	}
}
