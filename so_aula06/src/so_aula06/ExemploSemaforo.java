package so_aula06;

import java.util.concurrent.Semaphore;

public class ExemploSemaforo {
	public static void main(String[] args) {

		Semaphore semaforo = new Semaphore(1);
		for (int cont=0; cont<6; cont++) {
			Baixador b;
			b = new Baixador(cont, semaforo);
			Thread t = new Thread(b);
			t.start();
			Espera.esperar(0.5);
		}
	}
}



