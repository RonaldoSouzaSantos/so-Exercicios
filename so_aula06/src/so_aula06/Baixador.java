package so_aula06;

import java.util.concurrent.Semaphore;

public class Baixador implements Runnable {
	private int id;
	private Semaphore semaforo;
	public Baixador(int id, Semaphore semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}
	public void run() {
		try {
			System.out.println(id +
					": esperando no semáforo");
			semaforo.acquire();
			System.out.println(id +
					": liberado no semáforo");
			for (int i=0; i<5; i++) {
				Espera.esperar(0.5);
				System.out.println(id +
						": baixado " +
						i*100/4 + "%");
			}
			semaforo.release();
		} catch(InterruptedException e) {}
	}

}
