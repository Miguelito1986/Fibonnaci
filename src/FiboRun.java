

class Fibonacci1 implements Runnable {
	Thread t;
	Thread t2;
	int numero;

	Fibonacci1(int numeros) {
		this.numero = numeros;
		t = new Thread(this, "Hilo");
		t.start();
		t2=new Thread(this,"hilo2");
	}

	public void run() {
		System.out.println("Los " + numero + " primeros términos son:");
		int fibo1 = 1;
		int fibo2 = 1;
		System.out.print(fibo1 + " ");
		for (int i = 2; i <= numero; i++) {
			System.out.print(fibo2 + " ");
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		System.out.println();
	}
}

public class FiboRun {
	public static void main(String args[]) {
		new Fibonacci1(10);
		System.out.println("\n");
		new Fibonacci1(20);
	}
}


