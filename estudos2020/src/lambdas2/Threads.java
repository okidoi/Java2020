package lambdas2;

public class Threads {

	public static void main(String[] args) {
		
		Runnable runImpressao = () -> {
			for(int i = 0; i < 10; i++) {
				
				System.out.println("Imprimindo");
				
				try {
					Thread.sleep(90);
				} catch (Exception e) {}
			}
		};
		
		
		Runnable runCalculo = () -> {
			for(int i = 0; i < 10; i++) {
				
				System.out.println("Processando calculo");
				try {
					Thread.sleep(70);
				} catch (Exception e) {}				
			}
		};
		
		Runnable runWebSevice = Threads::consultaWebService;
		
		Thread thread1 = new Thread(runImpressao);
		Thread thread2 = new Thread(runCalculo);
		Thread thread3 = new Thread(runWebSevice);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
	
	static void consultaWebService() {

		for(int i = 0; i < 10; i++) {
			
			System.out.println("Consultando o Webservice XYZ");
			try {
				Thread.sleep(80);
			} catch (Exception e) {}				
		}
	}
	
}
