package tests;

import static org.junit.jupiter.api.Assertions.*;
import util.MisArrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testMedia {

	private static int[] notas;
	private static int[] notas2;
	private static int[] notas3;

	@BeforeAll
	static void setup() {

		notas = new int[] { 1, 2, 3, 4, 5 };
		notas2 = new int[] { 5, 5, 5, 5, 5 };
		notas3 = new int[] { -54, 12, 121, 3, 3 };

	}

	@Test
	void testMediaValida() {

		float mediaEsperada = 3.0f;
		float mediaObtenida = MisArrays.mediaNotas(notas);

		assertEquals(mediaEsperada, mediaObtenida);

	}

	@Test
	void testMediaValida2() {

		float mediaObtenida = MisArrays.mediaNotas(notas2);
		float mediaEsperada = 5;

		assertEquals(mediaEsperada, mediaObtenida);

	}

	@Test

	void testMediaNoValida() {

		Exception e = assertThrows(IllegalArgumentException.class, () -> MisArrays.mediaNotas(notas3));

		String mediaObtenida = e.getMessage();
		String mediaEsperada = "La nota no pertenece al rango establecido.";
		
		assertEquals(mediaEsperada, mediaObtenida);
		
	}

}
