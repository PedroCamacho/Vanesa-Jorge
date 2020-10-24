class cuentatras implements Runnable {
	Thread t;

	cuentatras() {
		t = new Thread(this, "Hilo cuenta atras");
		t.start();
	}

	@Override
	public void run() {

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ejercicio2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Empieza la cuenta atras");
		new cuentatras();
		Thread.sleep(11000);
		System.out.println("Termina la cuenta atras");
	}
}