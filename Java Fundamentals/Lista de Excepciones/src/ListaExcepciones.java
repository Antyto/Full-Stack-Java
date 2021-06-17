  
import java.util.*;

public class ListaExcepciones {
	
    static ArrayList myList = new ArrayList<>();
    
    public static void main(String[] args) {

        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        for(int i = 0; i < myList.size(); i++) {
            try {
                int castedValue = (int) myList.get(i);
            }
            catch(ClassCastException exception){
                exception.printStackTrace();
                System.out.println("Caught exception: " + myList.get(i));
            }
        }
    }
}