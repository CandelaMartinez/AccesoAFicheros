package leyendo;

import java.io.*;
//clase 154 Buffer

public class C152AccesoFicheros {

	public static void main(String[] args) {
		
		
		LeerFichero accediendo= new LeerFichero();
		accediendo.lee();

	}

}


class LeerFichero{

	public void lee() {
		
		//constructor de la clase FileREader throws FileNotFoundException que es del tipo IOException
		//me obliga a controlar la excepcion
		//tengo almacenado donde se encuentra el fichero
		try {
			
			FileReader entrada= new FileReader("D:/lenguajes/JAVA/eclipse/MiArchivo.txt");
			
			//creo el Buffer: pide argumento del tipo reader
			
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea="";
			
			
			//readline() devuelve null cuando no encuentra mas lineas
			//linea: hasta que haya un /n o un enter
			
			
			while(linea!=null) {
				
				//almacena la linea, la imprime
				linea= miBuffer.readLine();
				
				//imprime el null, lo controlo con un if
				if(linea!=null) {
					
				System.out.println(linea);
				
				}
			}
			
			
			//cerrar la comunicacion con el fichero externo+
			//entrada lanza una excepcion IOException controlada
			entrada.close();
			
			
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}