package ra.bt.bt2;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nh?p v�o ???ng d?n cho t?p tin ngu?n: ");
        String sourcePath = sc.nextLine();
        System.out.print("Nh?p v�o ???ng d?n cho t?p tin ?�ch: ");
        String destinationPath = sc.nextLine();
        try {
            Files.copy(Paths.get(sourcePath), Paths.get(destinationPath));
        } catch (NoSuchFileException e) {
            System.out.println("Kh�ng th? ti?n h�nh vi?c sao ch�p do ???ng d?n t?p tin ngu?n kh�ng ?�ng. Vui l�ng ki?m tra l?i");
            main(args);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Kh�ng th? ti?n h�nh vi?c sao ch�p do t?p tin ?�ch ?� t?n t?i. Vui l�ng ki?m tra l?i");
            main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
