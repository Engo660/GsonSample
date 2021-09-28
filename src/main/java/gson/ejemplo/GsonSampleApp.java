package gson.ejemplo;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonSampleApp {

	public static void main(String[] args) {
		int i = 0;
		Persona p = new Persona();

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe el nombre: ");
		p.nombre = teclado.nextLine();
		for (i = 0; i < p.nombre.length(); i++)
			if (!Character.isLetter(p.nombre.charAt(i)) && !(p.nombre.charAt(i) == ' ')) {
				System.out.println("El nombre solo puede tener letras, escribelo de nuevo");
				p.nombre = teclado.nextLine();
				i = 0;
			}
		System.out.println("Escribe los apellidos: ");
		p.apellidos = teclado.nextLine();
		for (i = 0; i < p.apellidos.length(); i++)
			if (!Character.isLetter(p.apellidos.charAt(i)) && !(p.apellidos.charAt(i) == ' ')) {
				System.out.println("El apellido solo puede tener letras, escribelo de nuevo");
				p.apellidos = teclado.nextLine();
				i = 0;
			}
		System.out.println("Escribe la edad: ");
		p.edad = teclado.nextInt();
		System.out.println("Persona registrada correctamente");
		System.out.println();

		teclado.close();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);

	}

}
