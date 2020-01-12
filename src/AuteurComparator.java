import java.util.Comparator;

public class AuteurComparator implements Comparator<Musique> {

	@Override
	public int compare(Musique musique1, Musique musique2) {
		return musique1.getAuteur().compareToIgnoreCase(musique2.getAuteur());
	}

}
