import jdk.jshell.EvalException;

import java.io.*;
import java.util.ArrayList;

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
                    new FileReader("src/datos.txt")
            );


            String[] palabras = br.readLine().split(" ");
            ArrayList<String> lista = new ArrayList<>();
            for (String palabra : palabras) {
                lista.add(palabra);
            }
            lista.sort();


            br.close();

            System.out.println(lista);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
