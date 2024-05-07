package util;

public abstract class MisArrays {

	public static float mediaNotas(int notas[]) {

		float suma = 0;

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] < 0 || notas[i] > 10) {

				throw new IllegalArgumentException("La nota no pertenece al rango establecido.");

			}

		}

		for (int i = 0; i < notas.length; i++) {

			suma += notas[i];
			
			System.out.println(notas[i]);
			
			System.out.println(suma);

		}

		return suma / notas.length;

	}

}
