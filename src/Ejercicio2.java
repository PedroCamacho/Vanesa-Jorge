class CuentaAtras implements Runnable {
	Thread t;

	public CuentaAtras() {
		t = new Thread(this, "Thread cuentaAtras");
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 10; i >= 1; i--) {
				t.sleep(1000);
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Ejercicio2 {
	public static void main(String[] args) {
		try {
			System.out.println("Comienzo de la cuenta atrás:");
			new CuentaAtras();
			Thread.sleep(11000);
			System.out.println("Fin de la cuenta atrás");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}