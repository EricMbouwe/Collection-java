import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class PlaylistMusiques {
	
	private ArrayList<Musique> musiques = new ArrayList<Musique>();

	public void initialiser() {
			chargerLaPlaylist();
	}

	private void chargerLaPlaylist() {
		File file = new File("musiques.txt"); 				// charge le fichier txt dans notre objet file
		//FileReader fileReader = new FileReader(file); 		// charge l'objet file dans un lecteur de fichier.
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			
			String ligne = null;
			while((ligne = bufferedReader.readLine()) != null) {
				//System.out.println(ligne);
				ajouterMusique(ligne);
			}	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void ajouterMusique(String ligne) {
		String[] partie = ligne.split("/");
		musiques.add(new Musique(partie[0], partie[1]));
	}

	public ArrayList<Musique> getMusiques() {
		return musiques;
	}

	public void setMusiques(ArrayList<Musique> musiques) {
		this.musiques = musiques;
	}

}
