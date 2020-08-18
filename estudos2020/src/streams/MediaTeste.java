package streams;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(8.3).adicionar(6.7);
		Media m2 = new Media().adicionar(7.9).adicionar(6.6);
		
		System.out.println("media: " + m1.getValor());
		System.out.println("media: " + m2.getValor());
		
		
		System.out.println("Media: " + Media.combinar(m1, m2).getValor());
	}
}
