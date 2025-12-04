/**
 * Muestra por pantalla la frase "¡Hola, Mundo!"
 * @author alexv
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
		String naranja = "\033[33m";
		String azul = "\033[34m";
		
        System.out.println(naranja + "¡Hola, Mundo!");
        System.out.println( azul + "Aqui estamos haciendo pruebas en GitHub.");
    }
}
