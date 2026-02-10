import java.io.BufferedReader;
import java.io.FileReader;

public class Lector{
    public int leerArchivo(int cantidad){
        int[] numeros = new int[cantidad];

        try{
            BufferedReader Lector = new BufferedReader(new FileReader("numeros.txt"));
            String linea;
            int i = 0;
            // Se leen los números uno por uno del archivo
            while (i < cantidad) {
                linea = lector.readLine();

                // Si ya no hay más líneas romple el ciclo
                if (linea == null) {
                    break;
                }
            lector.close();

                numeros[i] = Integer.parseInt(linea);
                i++;
            }

        }catch(Exception e){
            System.out.println("Error:" + e.getMessage);
        }
    }
    return numeros;
}