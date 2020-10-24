import java.util.Scanner;

class FibonacciImplements implements Runnable {
	Thread t;
	int N;

	public FibonacciImplements(int n) {
		this.N = n;
		t = new Thread(this, "Thread Fibonacci");
		System.out.println("Hilo creado " + t);
		t.start();
	}

	@Override
	public void run() {
		int num1 = 0, num2 = 1, suma = 1;
		System.out.println(num1);
		for (int i = 1; i < N; i++) {
			System.out.println(suma);
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}
	}
}

public class Ejercicio1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el cantidad de números de la sucesión: ");
		int num = sc.nextInt();
		new FibonacciImplements(num);
	}
}
