
public class Musique implements Comparable<Musique>{
	
	private String mTitre;
	private String mAuteur;
	
	public Musique(String titre, String auteur) {
		mTitre = titre;
		mAuteur = auteur;
	}
	
	@Override
	public String toString() {
		return mTitre + " de " + mAuteur;
	}

	public String getTitre() {
		return mTitre;
	}

	public void setTitre(String titre) {
		mTitre = titre;
	}

	public String getAuteur() {
		return mAuteur;
	}

	public void setAuteur(String auteur) {
		mAuteur = auteur;
	}

	@Override
	public int compareTo(Musique autreMusique) {
		return mTitre.compareToIgnoreCase(autreMusique.getTitre());
	}
	
	
}
