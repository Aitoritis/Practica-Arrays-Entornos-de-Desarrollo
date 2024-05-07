package util;

import java.util.Arrays;

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

	public static float maximaNota(int notas[]) {

		float notaMax = notas[0];

		for (int i = 0; i < notas.length; i++) {

			if (notaMax < notas[i]) {
				
				notaMax = notas[i];

			}

		}

		return notaMax;

	}
	
	public static float minimaNota(int notas[]) {

		float notaMin = notas[0];

		for (int i = 0; i < notas.length; i++) {

			if (notaMin > notas[i]) {
				
				notaMin = notas[i];

			}

		}

		return notaMin;

	}

}
