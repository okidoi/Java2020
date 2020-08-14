package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo refFuncao = (x, y) -> {
			return x + y;
		};
		
		
		System.out.println(refFuncao.executar(2, 3));
		
		
		//agora receberá outra implementação essa referencia
		refFuncao = (x, y) ->{
			return x * y;
		};
		
		
		System.out.println(refFuncao.executar(2, 3));
		
		//Outra opção é retirar as chaves. Neste caso o que vier a seguir (até o ponto e virgula) será automaticamente retornado.
		//Então quando omito o par de chaves, fica implicito para o java que terei apenas 1 sentença e que o resultado dela será retornado.
		refFuncao = (w, z) -> w*1 + z*2;
		
		System.out.println(refFuncao.executar(2,4));
		
	}
}
