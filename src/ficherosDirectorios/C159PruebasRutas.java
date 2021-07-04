package ficherosDirectorios;

import java.io.*;


public class C159PruebasRutas {

	public static void main(String[] args) {
		//constructor que pide una ruta al archivo que quiero manipular
		//apunta a un archivo que no existe
		File archivo= new File("bin");
		
		//ver cual es el path: toma como ruta, la ruta del proyecto, si no especifico ruta
		System.out.println(archivo.getAbsolutePath());

		//pregunto si existe o no el archivo. boolean
		System.out.println(archivo.exists());
	}

}
