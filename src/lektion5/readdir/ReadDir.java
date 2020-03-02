package lektion5.readdir;

import java.io.File;
import java.util.Scanner;

public class ReadDir {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        try {
            String[] arr = readdir(search);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (NullPointerException e) {
            System.out.println("Could not find dicretory: " + search);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String[] readdir(String search) throws NullPointerException, Exception{
        String[] paths;
        File file = null;
        String[] arr;

            // create new file object
            file = new File(search);

            // array of files and directory
            paths = file.list();
            arr = new String[paths.length];


            // for each name in the path array
            int counter = 0;
            for(String path:paths)
            {
                // prints filename and directory name
                arr[counter] = path;
                counter++;
            }
        return arr;
    }
}

