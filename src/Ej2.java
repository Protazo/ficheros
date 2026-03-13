import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej2 {
    public static void main() {
        int suma = obtenerSumaNumerosArchivo();
        System.out.println(suma);

    }
    static int obtenerSumaNumerosArchivo() {
        int suma = 0;
        try {
            FileReader fr = new FileReader("src/numNaturales.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                suma = suma + Integer.parseInt(linea);
            }

        } catch (IOException e) {};

        return suma;
    }
}
