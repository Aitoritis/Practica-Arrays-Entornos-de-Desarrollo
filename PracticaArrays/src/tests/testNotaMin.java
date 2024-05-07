package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class testNotaMin {

	private static int[] notas;
	private static int[] notas2;
	private static int[] notas3;
	
	@BeforeAll
	static void setup() {

		notas = new int[] { 1, 2, 3, 4, 5 };
		notas2 = new int[] { 9, 2, 3, 4, 1};
		notas3 = new int[] { -54, 12, 121, 3, 3 };

	}
	
	@Test
	void testNotaMaximaValida() {

		float notaEsperada = 1.0f;
		float notaObtenida = MisArrays.minimaNota(notas);

		assertEquals(notaEsperada, notaObtenida);

	}
	
	@Test
	void testNotaMaximaValida2() {
		
		float notaEsperada = 1.0f;
		float notaObtenida = MisArrays.minimaNota(notas2);
		
		assertEquals(notaEsperada, notaObtenida);
		
	}
	
	@Test
	void testNotaMinimaNoValida() {

		Exception e = assertThrows(IllegalArgumentException.class, () -> MisArrays.mediaNotas(notas3));

		String notaEsperada = "La nota no pertenece al rango establecido.";
		String notaObtenida = e.getMessage();
		
		assertEquals(notaEsperada, notaObtenida);
		
	}

}
