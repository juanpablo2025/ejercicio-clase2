import java.util.Scanner;

/**
 *
 * @author 509
 */
public class ejercicio {

	private static String nombre;
	private static int edad;
	private static String pais;
	private static Double tiempo;
	private static int min = 1;
	private static int max = 5, n;
	static Double ganador = (double) 0;
	static String nombreg, paisg;
	static int edadg;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		System.out.print("Ingresar el numero de ciclistas que competiran");
		n = a.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("\n Ingresa el nombre del ciclista");
			nombre = a.next();

			System.out.println("\n ingresa la edad del ciclista");
			edad = a.nextInt();

			System.out.println("\n Ingresa el pais del ciclista");
			pais = a.next();

			tiempo = Math.random() * (max - min) + min;

			System.out.print("\n El nombre del ciclista es: " + nombre
					+ "\n Edad: " + edad
					+ "\n Pais: " + pais
					+ "\n tiempo:" + tiempo);

			if (ganador < tiempo) {

				ganador = tiempo;
				nombreg = nombre;
				edadg = edad;
				paisg = pais;

			}

		}

		System.out.print("\n El ganador es: " + nombreg
				+ "\n Edad: " + edadg
				+ "\n Pais: " + paisg
				+ "\n tiempo:" + ganador);

	}

}
