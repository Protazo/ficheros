import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Ej6 {
    static void main() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/Shrek.txt")
            );

            int contvocales = 0;
            int contconsonantes = 0;
            int contnumeros = 0;

                String line = String.valueOf(br.readAllLines());

                String vocales = "aeiou";
                String consonantes = "bcdfghjklmnñpqrstvwxyz";
                String numeros = "0123456789";

                for (int i = 0; i < line.length(); i++) {
                    vocales.contains(String.valueOf(line.charAt(i)));
                    if (vocales.contains(String.valueOf(line.charAt(i)))) {
                        contvocales++;
                    }
                    if (consonantes.contains(String.valueOf(line.charAt(i)))) {
                        contconsonantes++;
                    }
                    if (numeros.contains(String.valueOf(line.charAt(i)))) {
                        contnumeros++;
                    }
                }



            System.out.println("Vocales: " + contvocales + " Consonantes: " + contconsonantes + " Números: " + contnumeros);

        } catch (Exception e) {}


    }
}
