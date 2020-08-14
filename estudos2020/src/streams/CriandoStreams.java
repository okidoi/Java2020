package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		
		Stream<String> langs = Stream.of("Java ", "Lua " , "JS ", "PHP\n");
		
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Pearl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs, 1, 3).forEach(print); //No range de 1 até n-1
		
		List<String> outrasLangs = Arrays.asList("C ", "C++ ", "COBOL ", "Coldfusion\n" );
		
		System.out.println("\n\nUsando stream");
		outrasLangs.stream().forEach(print);
		
		System.out.println("\n\nUsando parallelStream");
		outrasLangs.parallelStream().forEach(print);  //Não necessariamente na mesma ordem, pois vai fazer em paralelo
		
		//generate gera uma Stream teoricamente infinita. Recebe como parametro uma lambda que será um suplier
		//Stream.generate(()-> "X").forEach(print);
		
		//Aqui vc ja tem uma ordenacao, vc temo valor inicial (0), o segundo parametro no exemplo abaixo recebera um n e devolvera um n+1. Ele gera um que passa para o seguinte...etc
		Consumer<Integer> printInt = System.out::print;
		Stream.iterate(0, n-> n+1).forEach(printInt);
	}
}
