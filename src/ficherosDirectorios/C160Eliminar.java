package ficherosDirectorios;

import java.io.File;

//borrar la carpeta o archivo especificada en el path name

public class C160Eliminar {

	public static void main(String[] args) {
		
		File ruta2= new File("D:"+File.separator+"lenguajes"+File.separator+"JAVA"+File.separator+"eclipse"+File.separator+"AccesoFicheros"+File.separator+"javaSer"+File.separator+"nuevoDirectorio"+File.separator+"nuevoArchivo.txt");

		ruta2.delete();
		
	}

}
