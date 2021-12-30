import java.util.Scanner;

public class ServiceProduct {
    public Product creatProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap so luong:");
        int quantily = Integer.parseInt(sc.nextLine());
        System.out.println("Don vi tinh: ");
        String unit = sc.nextLine();
        System.out.println("Gia nhap: ");
        float importPrice = Float.parseFloat(sc.nextLine());
        System.out.println("Gia ban: ");
        float sellingPrice = Float.parseFloat(sc.nextLine());
        System.out.println("So luong ban:");
        int totalSell = Integer.parseInt(sc.nextLine());

        Product newProduct = new Product(id, name, quantily, unit, importPrice, sellingPrice, totalSell);
        return newProduct;
    }

    public Product[] addProduct(int size) {
        Product[] pr = new Product[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap san pham thu " + i);
            pr[i] = creatProduct();
        }
        return pr;
    }

    public double interest(float importPrice, float sellingPrice, int totalSell) {
        return (sellingPrice - importPrice) / 2;
    }

    public void showProduct(Product[] product) {
        for (Product prr : product) {
            System.out.println(prr + " - lai ban duoc: " + interest(prr.importPrice, prr.sellingPrice, prr.totalSell));
        }
    }
}
