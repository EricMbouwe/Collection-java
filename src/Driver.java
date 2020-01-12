import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {

	public static void main(String[] args) {
		PlaylistMusiques playlist = new PlaylistMusiques();
		playlist.initialiser();
	
		ArrayList<Musique> musiques = playlist.getMusiques();
		
		System.out.println("Liste de musiques");
		System.out.println(musiques);
		
		Collections.sort(musiques);    //tri par defaut a partir des titres
		
		System.out.println("Liste de musiques par titre");
		System.out.println(musiques);
		
		Collections.sort(musiques, new AuteurComparator());    // tri particulier a partir des noms d'auteurs a travers la classe Comparator
		
		System.out.println("Liste de musiques par auteur");
		System.out.println(musiques);	
		
	}
	
}
