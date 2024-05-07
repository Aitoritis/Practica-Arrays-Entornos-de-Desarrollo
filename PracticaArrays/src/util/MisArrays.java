package util;

import java.util.Arrays;

public abstract class MisArrays {
	
	/**
	 * Realiza la media de las notas implementadas por parametro
	 * 
	 * @param notas es el array que incluye las notas a realizar la media
	 * 
	 * @return La media de todas las notas
	 */

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
	
	/**
	 * Si el número de valores del array es par, 
	 * tendrás que coger los dos valores centrales y hacerles la media.
	 * 
	 * @param notas es el array del que se quiere saber la mediana
	 * 
	 * @return la mediana del array
	 */

	public static float medianaNotas(int notas[]) {

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] < 0 || notas[i] > 10) {

				throw new IllegalArgumentException("La nota no pertenece al rango establecido.");

			}

		}

		Arrays.sort(notas);

		int n = notas.length;

		if (n % 2 == 0) {

			int num = n / 2 - 1;

			int num2 = n / 2;

			return (notas[num] + notas[num2]) / 2.0f;

		} else {

			return notas[n / 2];

		}

	}
	
	/**
	 * Una funcion de la que se recibe un array y que te calcula la nota maxima
	 * 
	 * @param notas es el array del que se tiene un que calcular la nota maxima
	 * @return el valor maximo de ese array
	 */

	public static float maximaNota(int notas[]) {

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] < 0 || notas[i] > 10) {

				throw new IllegalArgumentException("La nota no pertenece al rango establecido.");

			}

		}

		float notaMax = notas[0];

		for (int i = 0; i < notas.length; i++) {

			if (notaMax < notas[i]) {

				notaMax = notas[i];

			}

		}

		return notaMax;

	}
	
	/**
	 * Una funcion de la que se recibe un array y que te calcula la nota minima
	 * 
	 * @param notas es el array del que se tiene un que calcular la nota minima
	 * @return el valor minima de ese array
	 */

	public static float minimaNota(int notas[]) {

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] < 0 || notas[i] > 10) {

				throw new IllegalArgumentException("La nota no pertenece al rango establecido.");

			}

		}

		float notaMin = notas[0];

		for (int i = 0; i < notas.length; i++) {

			if (notaMin > notas[i]) {

				notaMin = notas[i];

			}

		}

		return notaMin;

	}

}
