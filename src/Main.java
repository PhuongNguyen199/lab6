public class Main {
    public static void main(String[] args) {
        ServiceProduct svProduct = new ServiceProduct();
        Product[] products = svProduct.addProduct(2);
        svProduct.showProduct(products);
    }
}
