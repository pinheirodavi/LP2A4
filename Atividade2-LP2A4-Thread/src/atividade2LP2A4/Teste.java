package atividade2LP2A4;

public class Teste {

	public static void main(String[] args) {
		ThreadRunnable t1 = new ThreadRunnable("#1", 400);
		
		ThreadRunnable t2 = new ThreadRunnable("#2", 500);
		
		ThreadRunnable t3 = new ThreadRunnable("#3", 900);
		
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		Thread thread2 = new Thread(t2);
		thread2.start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Programa finalizado");
	}

}
