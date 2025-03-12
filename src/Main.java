import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //  C:\Users\cepin\Desktop\JavaAlgebra\21_10.03_Osnove_Zadatak\original.pdf

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesi putanju originalne datoteke:");
        String origigiPutanja = scan.nextLine();
        System.out.println("Unesi putanju gdje želiš kopirati datoteku:");
        String copyPutanja = scan.nextLine();

        File origigiFile = new File(origigiPutanja);
        File copyFile = new File(copyPutanja);

        try (FileInputStream ulaz = new FileInputStream(origigiFile); FileOutputStream izlaz = new FileOutputStream(copyFile)) {
            int c;
            while ((c = ulaz.read()) != -1) {
                izlaz.write(c);
            }
            System.out.println("Datoteka je uspješno kopirana.");
        } catch (FileNotFoundException e) {
            System.out.println("Došlo je do greške pri kopiranju: " + e.getMessage());
        }
        if (copyFile.exists()) {
            System.out.println("Želiš li obrisati kopiju? (y/n)");
            String odgovor = scan.nextLine();
            scan.close();

            if (odgovor.equalsIgnoreCase("y")) {
                copyFile.delete();
                System.out.println("Kopija je uspješno obrisana.");
            } else {
                System.out.println("Kopija je zadržana.");
            }
        }
    }
}

//Napiši Java program koji omogućuje kopiranje izvorne binarne datoteke.
//Tražite od korisnika putanju do originalne datoteke (npr. C:/temp/original.pdf)
//Tražite od korisnika naziv destinacijske datoteke (npr. C:/temp/ kopija.pdf)
//Koristeći FileInputStream i FileOutputStream, kopirajte byte po byte iz izvorne datoteke u destinacijsku
//Obradite sve moguće potencijalne iznimke (putanja ne postoji, nemate prava za pisanje ili čitanje, ...)
//Po završetku, provjerite je li kopija uspješno napravljena, te ju pokušajte otvoriti kroz File Explorer.
//Prouči klasu java.io.File. Pronađi metode exists() i delete(). Provjerite programski je datoteka prethodno uspješno kopirana (metoda exists) I ako je, pobrisite ju (metoda delete)