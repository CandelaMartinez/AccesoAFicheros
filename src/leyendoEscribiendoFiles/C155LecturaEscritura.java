package leyendoEscribiendoFiles;

import java.io.*;

//recibir y enviar informacion
//leo los bytes de una imagen
//almaceno esa informacion en un array
//los vuelvo en un archivo nuevo

public class C155LecturaEscritura {

	public static void main(String[] args) {
		int contador=0;
		
		//cantidad de bytes totales de mi imagen
		int datosEntrada[]= new int[402];
		
		try {
			//creo el objeto con la ruta a la imagen, tengo el canal abierto, para leer datos de un archivo
			FileInputStream  archivoLectura = new FileInputStream("D:/lenguajes/JAVA/eclipse/1.png");
		
		
			boolean finalAr= false;
			
			while(!finalAr) {
				
				//lee byte a byte el archivo de la ruta
				int byteEntrada= archivoLectura.read();
				
				//guardo en el array lo que va leyendo read()
				if(byteEntrada!=-1) {
					
					datosEntrada[contador]=byteEntrada;
					
				}
				
				
				//read() devuelve -1 cuando no hay mas bytes que leer
				else if (byteEntrada==-1) {
					
					finalAr=true;
					
					
					}
					
				//ver los bytes contenidos dentro del array
					System.out.println(datosEntrada[contador]);
					
					
				//saber cuantos bytes hay en la imagen
					contador++;
				
				}
			
			//cierro el stream
			archivoLectura.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("los bytes de la imagen son: "+contador);

		//llamar al metodo que crea la copia del fichero
		creaFichero(datosEntrada);
		
		
	}
	
	//metodo para escribir un archivo nuevo, static ya que la llamada la hago desde el main que es static
	static void creaFichero(int datosNuevoFichero[]) {
		
		try {
			FileOutputStream ficheroNuevo= new FileOutputStream("D:/lenguajes/JAVA/eclipse/1Copia.png");
			
			//leer todas las posiciones del array que va a recibir el metodo por parametro
			for(int i=0;i<datosNuevoFichero.length;i++) {
				
				ficheroNuevo.write(datosNuevoFichero[i]);
				
			}
			
		
			ficheroNuevo.close();

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
