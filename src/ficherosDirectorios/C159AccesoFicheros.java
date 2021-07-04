package ficherosDirectorios;
import java.io.*;

//exploro el sistema de archivos
public class C159AccesoFicheros {



	public static void main(String[] args) {
		
		//donde apunta el fichero ruta, donde tengo la carpeta
		//File ruta= new File("D:/lenguajes/JAVA/eclipse/AccesoFicheros/javaSer");
		
		//asegurar compatibilidad con cualquier SO usando la constante de clase separator
		File ruta= new File("D:"+File.separator+"lenguajes"+File.separator+"JAVA"+File.separator+"eclipse"+File.separator+"AccesoFicheros"+File.separator+"javaSer");
		
		
		System.out.println(ruta.getAbsolutePath());
		
		//metodo list me devuelve un array de Strings con nombres de carpetas y directorio en la ruta
		String[] nombresArchivos=ruta.list();
		
		for(int i=0; i<nombresArchivos.length;i++) {
			System.out.println(nombresArchivos[i]);
			
			//cada vuelta de bucle guarda ruta y los que esta almacenado en el array
			File f= new File(ruta.getAbsolutePath(), nombresArchivos[i]);
			//preguntar si donde esta apuntando f es archivo o directorio
			
			if(f.isDirectory()) {
				
				//si lo es, guardo su contenido en un array, y lo muestro
				String [] archivosSubcarpeta= f.list();
				
				for(int j=0; j<archivosSubcarpeta.length;j++) {
					
					System.out.println(archivosSubcarpeta[j]);
				}
				
			}
			
		}

		//metodo isDirectory: es carpeta o no? si es carpeta, entro y listo lo que hay dentro
		
		
		
	}

}
