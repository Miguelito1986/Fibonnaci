

/**
 * 
 * @author Vaio
 * Me creo una clase dentro de fibonacci
 */
class Fibo extends Thread {
	//Me declaro la variable
	int numero;
	String nombre; 
	/**
	 * 
	 * @param numeros
	 *{@code constructor}
	 */
	public Fibo(int numeros,String nombre) {
		this.numero = numeros;
		this.nombre=nombre;
	}

	/**
	 * me creo el metodo el sobreescrito de run();
	 * 
	 */
	public void run() {
		System.out.println("Los " + numero+ " primeros términos de la serie de Fibonacci son caluclados por:"+nombre+" son:");
		int num1 = 1;
		int num2 = 1;
		System.out.print(num1 + " ");
		for(int i = 2; i <= numero; i++) {
			System.out.print(num2 + " ");
			num2 = num1 + num2;
			num1 = num2 - num1;
		}
		System.out.println();
	}
}

/**
 * 
 * @author Miguelitox
 *
 */

/*public class Fibonacc {
	public static void main(String args[]) throws InterruptedException {
		//Llamo a la clase fibo y le paso el numero por el constructor
		Fibo miHilo = new Fibo(20,"hilo1");
		miHilo.start();
		
		System.out.println("\n");
		Fibo miHilo2=new Fibo(30,"Hilo2");
		miHilo2.start();
	}
}*/

