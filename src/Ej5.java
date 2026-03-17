import jdk.jshell.EvalException;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ej5 {
    static void main() {

        try {

            PrintWriter pw = new PrintWriter(
                    new BufferedWriter (new FileWriter("src/datos.txt")));
            pw.write("Escribe un programa que guarde en un fichero con nombre primos.dat los números " +
                    "primos que hay entre 1 y 500. Luego lea el fichero y muestre los números primos por " +
                    "pantalla");

            pw.close();

            BufferedReader br = new BufferedReader(
                    new FileReader("src/Shrek.txt")
            );


            String palabras = String.valueOf(br.readAllLines());
            String[] palabrasarray = palabras.split(" ");
            ArrayList<String> lista = new ArrayList<>();
            for (String palabra : palabrasarray) {
                lista.add(palabra);
            }
            Collections.sort(lista);


            br.close();

            PrintWriter pw2 = new PrintWriter(
                    new BufferedWriter (new FileWriter("src/ej5.txt")));

            for (int i = 0; i < lista.size(); i++) {
                pw2.println(lista.get(i));
            }

            pw2.close();
            System.out.println(lista);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
