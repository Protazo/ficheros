import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ej7 {
    static void main() {
        System.out.println("Qué guión quieres leer: ");
        System.out.println("1. Shrek");
        System.out.println("2. Primos");

        Scanner scan = new Scanner(System.in);
        String option = scan.nextLine();

        if (option.equals("1")) {
            mostrarArchivoPantalla(new File("src/Shrek.txt"));
        }
        if (option.equals("2")) {
            mostrarArchivoPantalla(new File("src/primos.dat"));
        }

    }

    public static void mostrarArchivoPantalla(File file) {
        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }

        } catch (FileNotFoundException e) {}

    }
}
