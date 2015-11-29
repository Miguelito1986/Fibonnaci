
class Hilo implements Runnable{

	Thread h;
	int contador;
	
	
	
	public Hilo(int contador) {
		super();
		this.h = new Thread(this,"hilo");
		this.contador = contador;
		h.start();
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			try {
				System.out.println("Comienza  la cuenta atr�s:");
				for (int i = contador; i > 0 ; i--) {
				System.out.println(i);
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Fin de la cuenta atr�s");
		}
	
	
}

public class Contador {
	public static void main(String args[]) {
		new Hilo(10);
	}
}
