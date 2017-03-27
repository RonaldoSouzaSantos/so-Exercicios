package br.edu.impacta.so;

class Adiciona{
	public void incrementar(){
		for(int y=0; y<5; y++){
			System.out.println("incremento" + y);
			try {Thread.sleep(100);}
			catch(Exception e){}
		}
	}
}
public class ExemploThreaSimples {
	
	public static void main(String[] args){
		Adiciona adiciona = new Adiciona();
		adiciona.incrementar();
		for (int x=5; x>=0; x--){
			System.out.println("decremento" + x);
			try {Thread.sleep(100);}
			catch(Exception e){}
		}
	}

}
