package lambdas;

import java.util.function.BinaryOperator;


//Utiliza as classes de apoio do pacote Util (java 8) que j� facilitam (tipo as classes adaptadoras)
//Para n�o criar outra interface funcional.

public class CalculoTeste3 {

	public static void main(String[] args) {

		//int -> Double (n�o faz isso explicitiamente)
		//double -> Double (faz isso automaticamente)
		
		BinaryOperator<Double> calc = (x, y) -> {return x + y;};  //BinaryOperator
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));
		
	}
}
