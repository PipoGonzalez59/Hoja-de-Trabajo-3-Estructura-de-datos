import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Random;

public class GeneradosNumeros{
    public void generarArchivo(String ruta, int cantidad){
        FileWriter archivo = null;
        PrinWriter escritor = null;
        Random ran = new Random();
        try {
            archivo = new FileWriter(ruta);
            escritor = new PrintWriter(archivo);

            //generador de numero aleatorios
            for (int i = 0; i < cantidad; i++) {
                int numero = rand.nextInt(10000);
                escritor.println(numero);
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage);
        } finally {
            if(escritor = !null) {
                escritor.close();
            }
        }
    }
}