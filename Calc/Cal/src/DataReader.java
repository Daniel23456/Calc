import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DataReader {

	public static double firstValue;
	public static double secondValue;

	public static double suma() {

		double resultado = 0;
		resultado = firstValue + secondValue;
		return resultado;
	}
	public static double resta() {

		double resultado = 0;
		resultado = firstValue - secondValue;
		return resultado;
	}

	public static void main(String[] args) throws IOException {

		//System.out.println("Bienvenido a la calculadora");
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		// Usamos como delimitador el dos puntos, o bien cualquier
		// espacio/fin de línea (el \\s)
		sc.useDelimiter("[:\\s]");

		firstValue = sc.nextInt();
		secondValue = sc1.nextInt();

		System.out.println("El resultado de la suma es " + resta());
		

	}
}