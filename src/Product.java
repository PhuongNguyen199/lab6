public class Product {
    public int id;
    public String name;
    public int quantily;
    public String unit;
    public float importPrice;
    public float sellingPrice;
    public int totalSell;

    public Product() {
    }

    public Product(int id, String name, int quantily, String unit, float importPrice, float sellingPrice, int totalSell) {
        this.id = id;
        this.name = name;
        this.quantily = quantily;
        this.unit = unit;
        this.importPrice = importPrice;
        this.sellingPrice = sellingPrice;
        this.totalSell = totalSell;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantily=" + quantily +
                ", unit='" + unit + '\'' +
                ", importPrice=" + importPrice +
                ", sellingPrice=" + sellingPrice +
                ", totalSell=" + totalSell +
                '}';
    }
}
