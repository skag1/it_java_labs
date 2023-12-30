import java.util.*;

public class SalesManager {
    private HashSet<Product> soldProducts;
    private double totalSales;
    private HashMap<String, Integer> productQuantityMap;

    public SalesManager() {
        soldProducts = new HashSet<>();
        totalSales = 0;
        productQuantityMap = new HashMap<>();
    }

    public void addSoldProduct(Product product, int quantity) {
        soldProducts.add(product);
        totalSales += product.getPrice() * quantity;

        if (productQuantityMap.containsKey(product.getName())) {
            productQuantityMap.put(product.getName(), productQuantityMap.get(product.getName()) + quantity);
        } else {
            productQuantityMap.put(product.getName(), quantity);
        }
    }

    public void printSoldProducts() {
        System.out.println("Sold products:");
        for (Product product : soldProducts) {
            System.out.print(product.getName() + " ");
        }
        System.out.println();
    }

    public double getTotalSales() {
        return totalSales;
    }

    public String getMostPopularProduct() {
        String mostPopularProduct = "";
        int maxQuantity = 0;

        for (Map.Entry<String, Integer> entry : productQuantityMap.entrySet()) {
            if (entry.getValue() > maxQuantity) {
                mostPopularProduct = entry.getKey();
                maxQuantity = entry.getValue();
            }
        }

        return mostPopularProduct;
    }

    public static void main(String[] args) {
        SalesManager manager = new SalesManager();

        Product product1 = new Product("Product1", 10.0);
        Product product2 = new Product("Product2", 20.0);
        Product product3 = new Product("Product3", 30.0);

        manager.addSoldProduct(product1, 5);
        manager.addSoldProduct(product2, 10);
        manager.addSoldProduct(product3, 3);
        manager.addSoldProduct(product1, 2);
        manager.addSoldProduct(product2, 8);

        manager.printSoldProducts();
        System.out.println("Total sales: " + manager.getTotalSales());
        System.out.println("Most popular product: " + manager.getMostPopularProduct());
    }
}