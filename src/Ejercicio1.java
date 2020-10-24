import java.util.Scanner;

class fibonacciRun implements Runnable {
	Thread t;
	private int n;

	fibonacciRun(int n) {
		this.n = n;
		t = new Thread(this, "Fibonacci");
		t.start();
	}

	public void run() {
		int resultado = 1;
		int num1 = 0;
		int num2 = 1;
		for (int i = 1; i < n + 1; i++) {
			System.out.println(resultado);
			resultado = num1 + num2;
			num1 = num2;
			num2 = resultado;
		}
	}
}

public class Ejercicio1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce numero: ");
		int n = sc.nextInt();
		new fibonacciRun(n);
	}
}