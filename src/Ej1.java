import java.io.*;

public class Ej1 {
    static void main() {
        try {
            PrintWriter pw = new PrintWriter(
                    new BufferedWriter(new FileWriter("src/datos.txt"))
            );

            for (int i = 1; i <= 100; i++) {
                pw.println(i);
            }
            pw.close();
        } catch (Exception e) {}
    }
}
