package Mensagens;

import java.util.concurrent.ArrayBlockingQueue;

public class ExemploPassagemMensagens {
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> mensagens;
		mensagens = new ArrayBlockingQueue<>(3);
		Produtor p = new Produtor(mensagens);
		Consumidor c = new Consumidor(mensagens);
		p.start();
		c.start();
	}
}
class Produtor extends Thread {
	private ArrayBlockingQueue<Integer> msgs;
	Produtor(ArrayBlockingQueue<Integer> m){
		this.msgs = m;
	}
	public void run() {
		try{
			for (int i=0; i<6; i++) {
				Espera.esperar(0.2);
				System.out.println("produtor: antes");
				msgs.put(i);
				System.out.println("produtor: após");
			}
		} catch(InterruptedException e) {}
	}
}
