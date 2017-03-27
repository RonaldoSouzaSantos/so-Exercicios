package so_aula06;

public class Espera {


	public static void esperar(double t) {
		try {
			Thread.sleep((int)(t*1000));
		} catch(InterruptedException e) {}
	}
}



