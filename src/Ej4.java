import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Ej4 {
    static void main() {

        try {

            BufferedReader br = new BufferedReader(
                    new FileReader("src/Shrek.txt")
            );


            String prueba = br.readLine();
            prueba = prueba.replaceAll(" ", "");
            prueba = prueba.toUpperCase();
            System.out.println(prueba);

        } catch (Exception e) {}



    }
}
