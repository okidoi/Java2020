package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo refFuncao = (x, y) -> {
			return x + y;
		};
		
		
		System.out.println(refFuncao.executar(2, 3));
		
		
		//agora receber� outra implementa��o essa referencia
		refFuncao = (x, y) ->{
			return x * y;
		};
		
		
		System.out.println(refFuncao.executar(2, 3));
		
		//Outra op��o � retirar as chaves. Neste caso o que vier a seguir (at� o ponto e virgula) ser� automaticamente retornado.
		//Ent�o quando omito o par de chaves, fica implicito para o java que terei apenas 1 senten�a e que o resultado dela ser� retornado.
		refFuncao = (w, z) -> w*1 + z*2;
		
		System.out.println(refFuncao.executar(2,4));
		
	}
}
