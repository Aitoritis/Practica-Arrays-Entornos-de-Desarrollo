package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class testMediana {

	private static int[] notas;
	private static int[] notas2;
	private static int[] notas3;
	
	@BeforeAll
	static void setup() {

		notas = new int[] { 1, 2, 3, 4, 5 };
		notas2 = new int[] { 5, 5, 4, 4, 5, 5};
		notas3 = new int[] { -54, 12, 121, 3, 3 };

	}
	
	@Test
	void testMedianaValida() {

		float medianaEsperada = 3.0f;
		float medianaObtenida = MisArrays.medianaNotas(notas);

		assertEquals(medianaEsperada, medianaObtenida);

	}
	
	@Test
	void testMedianaValida2() {
		
		float medianaEsperada = 5.0f;
		float medianaObtenida = MisArrays.medianaNotas(notas2);
		
		assertEquals(medianaEsperada, medianaObtenida);
		
	}
	
	@Test

	void testMedianaNoValida() {

		Exception e = assertThrows(IllegalArgumentException.class, () -> MisArrays.mediaNotas(notas3));

		String medianaObtenida = e.getMessage();
		String medianaEsperada = "La nota no pertenece al rango establecido.";
		
		assertEquals(medianaEsperada, medianaObtenida);
		
	}

}
