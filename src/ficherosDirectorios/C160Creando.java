package ficherosDirectorios;
import java.io.*;

public class C160Creando {

	public static void main(String[] args) {
		
		//crear un nuevo directorio dentro de la carpeta javaSer, agrego el nombre del directorio que quiero crear en la ruta
		
		File ruta= new File("D:"+File.separator+"lenguajes"+File.separator+"JAVA"+File.separator+"eclipse"+File.separator+"AccesoFicheros"+File.separator+"javaSer"+File.separator+"nuevoDirectorio");

		//mkdir() crea directorio y me devuelve boolean true si lo creo
		ruta.mkdir();
		
		//crear un archivo, indico en el path el nombre del archivo
		File ruta2= new File("D:"+File.separator+"lenguajes"+File.separator+"JAVA"+File.separator+"eclipse"+File.separator+"AccesoFicheros"+File.separator+"javaSer"+File.separator+"nuevoDirectorio"+File.separator+"nuevoArchivo.txt");

		//almaceno en esta variable la ruta 
		String archivoDestino= ruta2.getAbsolutePath();
		
		
		//createNewFile() crea un fichero vacio, solo si no existe, lanza una excepcion IOException
		
		try {
		
			ruta2.createNewFile();
		
		}catch(Exception e) {}
		
		
		//escribir en su interior
		Escribiendo accedeEs= new Escribiendo();
		
		accedeEs.escribir(archivoDestino);
		
		
		
	}

}

class Escribiendo {
	
	public void escribir(String rutaArchivo) {
		
		String frase="esto es un ejemplo";
		
		try {
			//le digo que vamos a escribir en el archivo 
			FileWriter escritura= new FileWriter(rutaArchivo);
			
			//recorrer la frase
			for (int i=0; i<frase.length(); i++) {
				escritura.write(frase.charAt(i));
				
			}
			
			//cierro el stream
			escritura.close();
			
			
		}catch(Exception e) {
			
		}
		
	}
	
}


