class HiloInfinito extends Thread {
	public void run() {
		int i = 1;
		while (true) {	
			System.out.println(i++);
		}
	}
}

public class Descontrol {
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException {
		Thread miHilo = new HiloInfinito();
		System.out.println("Comienzo del contador:");
		miHilo.start();
		Thread.sleep(10);
		miHilo.stop();
		System.out.println("Fin del contador descontrolado");
	}
}
