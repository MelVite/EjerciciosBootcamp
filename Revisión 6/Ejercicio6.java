package com.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[] n = new int[20];

	    for (int i = 0; i < 20; i++) { //Se arregla el incremento
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }
	    
	    //Falta la entrada de un usuario
	    Scanner sc = new Scanner(System.in);
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    //int option = sc.nextInt();
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine()); //Se agrega parentesis de cierre

	    int multiplo = (opcion == 1) ? 5 : 7; //Se arregla el ternario

	    for (int e : n) {   //Es un for, y e es in int no un char
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else { //Se agrega llave de cierre del if
	        System.out.print(e + " "); //Es out en lugar de in
	      }
	    }

	}

}
