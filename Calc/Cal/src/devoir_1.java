
import java.io.*;

public class devoir_1 {
	public static void main(String arg[]) throws IOException {
		int a, b, c;
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String ingresado1;
		String ingresado2;
		String ingresado3;
		System.out.println("Ingrese A....");
		ingresado1 = lector.readLine();
		a = Integer.parseInt(ingresado1);
		System.out.println("Ingrese B....");
		ingresado2 = lector.readLine();
		b = Integer.parseInt(ingresado2);
		System.out.println("Ingrese C....");
		ingresado3 = lector.readLine();
		c = Integer.parseInt(ingresado3);

		if (b * b < 4 * a * c) {
			System.out.println("Solucion perteneciente al campo de los numeros complejos.");
		} else if (a != 0 && b * b > 4 * a * c) {
			System.out.println("La primera solucion es " + (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			System.out.println("La segunda solucion es " + (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
		} else {
			System.out.println("Esta ecuacion no es de segundo grado.");
		}

	}

}