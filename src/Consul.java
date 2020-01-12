import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Consul {

	public static void main(String[] args) {
		
		ArrayList<Integer> chiffres = new ArrayList<Integer>();
		
		chiffres.add(15);
		chiffres.add(189);
		chiffres.add(79);
		chiffres.add(1054);
		chiffres.add(234);
		
		System.out.println(chiffres);
		
		Collections.sort(chiffres);
		
		System.out.println(chiffres);
		
		
	}

}
