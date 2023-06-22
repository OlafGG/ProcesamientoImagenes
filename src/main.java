import java.io.IOException;


public class main {
	static String PATH = "C:\\Users\\Olaf\\Downloads\\keanu.jpg";
//  static String PATH = "C:\\Users\\bmtz5\\OneDrive\\Imágenes\\fotoPersona.jpeg";
	public static void main(String[] args) throws IOException {
      System.out.println("Ejecutando proyecto");

      Ventana ventana = new Ventana(PATH);
	}
}
