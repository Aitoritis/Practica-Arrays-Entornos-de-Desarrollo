package main;

import util.MisArrays;

public class main {

	public static void main(String[] args) {
		
		int notas[] = {7, 2, 3, 4, 5, 1};
		
		System.out.println(MisArrays.mediaNotas(notas));
		
		System.out.println(MisArrays.medianaNotas(notas));
		
		System.out.println(MisArrays.maximaNota(notas));
		
		System.out.println(MisArrays.minimaNota(notas));
		
	}

}
