import java.io.*;

public class Ej3 {
    static void main() {

        try {
            PrintWriter pw = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("src/primos.dat")
                    )
            );


        for (int i = 1; i <= 500; i++) {
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador++;
                }
            }
            if (contador <= 2) {
                pw.println(i);
            }
        }
        pw.close();

        BufferedReader br = new BufferedReader(new FileReader("src/primos.dat"));
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }

        } catch (Exception ex) {}
    }
}
