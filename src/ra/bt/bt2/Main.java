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
        System.out.print("Nh?p vào ???ng d?n cho t?p tin ngu?n: ");
        String sourcePath = sc.nextLine();
        System.out.print("Nh?p vào ???ng d?n cho t?p tin ?ích: ");
        String destinationPath = sc.nextLine();
        try {
            Files.copy(Paths.get(sourcePath), Paths.get(destinationPath));
        } catch (NoSuchFileException e) {
            System.out.println("Không th? ti?n hành vi?c sao chép do ???ng d?n t?p tin ngu?n không ?úng. Vui lòng ki?m tra l?i");
            main(args);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Không th? ti?n hành vi?c sao chép do t?p tin ?ích ?ã t?n t?i. Vui lòng ki?m tra l?i");
            main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
