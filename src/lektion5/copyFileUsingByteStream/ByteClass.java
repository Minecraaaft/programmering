package lektion5.copyFileUsingByteStream;

import java.io.*;
import java.util.Scanner;

public class ByteClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter source: ");
        String source = scanner.nextLine();

        System.out.print("Please enter new directory name: ");
        String destinationName = scanner.nextLine();

        try {
            copyFileTo(source, destinationName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void copyFileTo(String source, String destination) throws FileNotFoundException, IOException {
        FileInputStream in = null;
        FileOutputStream out = null;


        try {
            in = new FileInputStream("src/lektion5/bopyFileUsingByteStream/" + source);
            out = new FileOutputStream("src/lektion5/copyFileUsingByteStream/" + destination);

            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
