package ra.bt.bt1;

import java.io.Serializable;

import static ra.bt.bt1.Main.scanner;

public class Product implements Serializable {
    private static final long serialVersionUID = 6440663599007569191L;
    private int id;
    private String productName;
    private String productBrand;
    private String desc;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void inputData() {
        System.out.println("Input data");
        System.out.println("id:");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.println("name:");
        this.productName = scanner.nextLine();
        System.out.println("brand:");
        this.productBrand = scanner.nextLine();
        System.out.println("desc:");
        this.desc = scanner.nextLine();
        System.out.println("price:");
        this.price = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productBrand='" + productBrand + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(int id, String productName, String productBrand, String desc, float price) {
        this.id = id;
        this.productName = productName;
        this.productBrand = productBrand;
        this.desc = desc;
        this.price = price;
    }
}
