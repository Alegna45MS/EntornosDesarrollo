package UD2;

public class Ejercicio1 {
	//n       ->5
	//sum     ->Al principio es 0 y luego va sumando la i:1,3,6,10,15
	//i       -> Empieza con uno y luego 2,3,4,5
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum=sum + i;
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
	}
}

