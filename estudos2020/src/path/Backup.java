package path;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Backup {
	
	public static void main(String[] args) {
		
		//Classe Path existe a partir do Java 7
		
		Path myFolder = Paths.get("C:/workspaces/workspace_2020/estudos2020/src/path");
		String filtro = "*.java";
		
		try {
			
			DirectoryStream<Path> stream = Files.newDirectoryStream(myFolder, filtro); //Opens a directory, returning a DirectoryStream to iterate over all entries in the directory.
			
			for (Path p : stream) {
				
				Path original = myFolder.resolve(p);        
				Path backup = myFolder.resolve(p + ".bkp");
				
				Files.copy(original, backup, StandardCopyOption.REPLACE_EXISTING);  //Faz uma copia do arquivo o sufixo .bkp e se j� existir ele sobrescreve.
				
				System.out.println("Um backup dos arquivos java da pasta C:/workspaces/workspace_2020/estudos2020/src/path foi realizado");
				
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
