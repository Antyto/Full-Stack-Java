
public class ProyectoTest {
	
	// Testing out our Project class
    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Manejo de las Emociones", "Presencial/Flexible");
        System.out.println(proyecto1.elevatorPitch());

        Proyecto proyecto2 = new Proyecto("Formacion de Jovenes Lideres" , "Vespertino/Semi-flexible");
        System.out.println(proyecto2.elevatorPitch());
        
        Proyecto proyecto3 = new Proyecto("Trabajo en Equipo" , "On-line");
        System.out.println(proyecto3.elevatorPitch());
    }
}