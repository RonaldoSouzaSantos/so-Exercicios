package Mensagens;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumidor extends Thread {
	private ArrayBlockingQueue<Integer> msgs;
	Consumidor(ArrayBlockingQueue<Integer> m){
		this.msgs = m;
	}
	public void run() {
		try{
			for (int i=0; i<6; i++) {
				System.out.println("consumidor: antes");
				int valor = msgs.take();
				System.out.println("consumidor: valor=" + valor);
				Espera.esperar(1);
			}
		} catch(InterruptedException e) {}
	}
}
class Espera {
	public static void esperar(double t) {
		try { Thread.sleep((int)(t*1000)); }
		catch(InterruptedException e) {}
	}


}
