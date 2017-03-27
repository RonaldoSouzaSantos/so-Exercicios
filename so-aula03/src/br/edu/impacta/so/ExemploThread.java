package br.edu.impacta.so;

class ExecAdiciona implements Runnable{

	public void run(){
		for (int y=0; y<5; y++){
			System.out.println("incremento" + y);
			try{Thread.sleep(100);}
			catch(Exception e){}
		}
	}
}

public class ExemploThread {
	public static void main(String[] args){
		Runnable run = new ExecAdiciona();
		Thread t = new Thread(run);
		t.start();
		for(int x=4; x>=0; x--){
			System.out.println("decremento" + x);
			try {Thread.sleep(100);}
			catch(Exception e){}
		}
	}

}
