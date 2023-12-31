package org.cuatrovientos.DAM.entornosdesarrollo.MiProyectoJava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Calculadora {
	private static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		System.out.println("Hello World!");
		logger.error("Hellow world with Log4j ");

		Calculadora miCalculadora = new Calculadora();
		{

			switch (args[0]) {
			case "sumar":
				int resultado = miCalculadora.sumarDosNumeros(args[1], args[2]);
				logger.error("Resultado es: " + resultado);
				break;
			default:
				break;
			}

		}
	}
/**
 * MÉTODO PARA SUMAR NÚMEROS
 * @param numero1: El primer número a sumar
 * @param numero2: El segundo número a sumar
 * @return: El número sumado
 * 
 * TODO Me falta validar que numero1 y numero2 sean números
 */
public int sumarDosNumeros (String numero1, String numero2) {
int numero1Int = Integer.valueOf (numero1);//Convertimos el primer número a entero.
int numero2Int = Integer.valueOf (numero2);//FIXME da error cuando numero2 es una letra.
return numero1Int + numero2Int;
}
}
