import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String file = args[0];
        String palabra = args[1];
        palabra = palabra.toUpperCase();
        System.out.println(file);
        System.out.println(palabra);


        int contadorpalabra = 0;
        try {

            BufferedReader br = new BufferedReader(
                    new FileReader(file));

            ArrayList<String> lista = new ArrayList<>();

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split(" ");
                for (String p : palabras) {
                    p = p.toUpperCase();
                    if (p.contains(palabra)) {
                        contadorpalabra++;
                    }
                }
            }

            System.out.println("Tu palabra ha aparecido ");
            System.out.println(contadorpalabra);

            br.close();

        } catch (IOException e) {}



    }
}
