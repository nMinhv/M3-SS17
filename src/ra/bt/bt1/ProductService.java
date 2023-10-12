package ra.bt.bt1;

import java.util.InputMismatchException;

import static ra.bt.bt1.Main.*;

public class ProductService {

    public void add() {
        try {
            System.out.println("Number?");
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                Product newp = new Product();
                newp.inputData();
                productList.add(newp);
            }
        } catch (InputMismatchException e) {
            System.out.println("Not a number");
            add();
        }
    }

    public void show() {
        ProductSerializable productSerializable = new ProductSerializable();
        productSerializable.importFile();
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }
    public void search() {
        System.out.println("name?");
        String str = scanner.nextLine();
        for (Product product : productList) {
            if(product.getProductName().equalsIgnoreCase(str)){
                System.out.println(product);
            }
        }
    }
}
