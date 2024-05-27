package com.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in); //Se agrega system.in y se importa Scanner
	    System.out.println("Introduzca un número: ");
	    int ni = s.nextInt(); //Cambio de string a int
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      } //Cierre de ciclo else 
		  ni /= 10;
	    }
	    
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
    
    }
  
}
