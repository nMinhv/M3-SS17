package ra.bt.bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        ProductSerializable productSerializable = new ProductSerializable();
        while (true) {
            System.out.println("1. them");
            System.out.println("2. hien thi");
            System.out.println("3. tim kiem");
            ProductService service = new ProductService();
            byte bit = Byte.parseByte(scanner.nextLine());
            switch (bit) {
                case 1:
                    service.add();
                    productSerializable.exportFile();
                    break;
                case 2:
                    service.show();
                    break;
                case 3:service.search();
                    break;
                case 4:
                    productSerializable.exportFile();
                    System.out.println("success imported file");
                    System.exit(0);
            }
        }
    }
}
