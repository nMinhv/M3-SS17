package ra.bt.bt1;
import java.io.*;
import java.util.List;
import static ra.bt.bt1.Main.productList;
public class ProductSerializable {
    public static File file = new File("src/ra/bt/bt1/product.dat");
    public  void exportFile() {
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public  void importFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream outputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) outputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (ClassNotFoundException e) {
            System.out.println("Product list not found");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
