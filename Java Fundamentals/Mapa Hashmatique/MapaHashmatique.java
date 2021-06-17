import java.util.HashMap;
import java.util.Set;

public class MapaHashmatique {

	public static void main(String[] args) {
		
        HashMap<String, String> lista = new HashMap<String, String>();
        lista.put("World Gone Wild - Banda: Unsecret/Sam Tinnesz", "Dangerous mind/Are coming out of the dark/You better watch out/Watch out...");
        lista.put("Given Up - Banda: Linkin Park", "Wake in a sweat/Another day's been laid to waste/In my disgrace...");
        lista.put("Coming Undone - Banda: KORN", "Keep holding on/When my brain's ticking like a bomb...");
        lista.put("Chalk Outline - Banda: Three Days Grace", "I've been cursed/I've been crossed/I've been beated by the ones that get me off...");

        
        String cancion = lista.get("World Gone Wild");
        
        Set<String> keys = lista.keySet();
        for (String key: keys) {
            System.out.println("Titulo: " + key);
            System.out.println("Letra: " + lista.get(key));
        }

	}

}
