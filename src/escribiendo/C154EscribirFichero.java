package escribiendo;

import java.io.FileWriter;
import java.io.IOException;

public class C154EscribirFichero {

	public static void main(String[] args) {
	Escribiendo accedeEscritura= new Escribiendo();
	accedeEscritura.escribir();

	}

}

class Escribiendo{
	
	public void escribir() {
		
		String frase="esto es una prueba de escritura";
		
	//me va a crear un archivo nuevo en ese path
		
		try {
			
			
			FileWriter escritura= new FileWriter("D:/lenguajes/JAVA/eclipse/MiArchivoNuevo.txt");
		
			//que vaya escribiendo caracter a caracter la frase
			for(int i=0; i<frase.length();i++) {
				
				//que vaya escribiendo el char que se encuentre en la posicion i
				escritura.write(frase.charAt(i));
				
			}
			
			//cerrar el stream 
			escritura.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}