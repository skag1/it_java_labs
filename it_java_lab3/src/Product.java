import java.util.ArrayList;
import java.util.Date;

public class Product {
    private String productName;
    private String productDescription;
    private int price;

    public Product(String newProductName, String newProductDescription, int newPrice, int newProductAmount){
        this.productName = newProductName;
        this.productDescription = newProductDescription;
        this.price = newPrice;
    }

    public String getName() {
        if (this.productName == null) {
            return null;
        } else {
            return this.productName;
        }
    }

    public String getDescription() {
        if (this.productDescription == null) {
            return null;
        } else {
            return this.productDescription;
        }
    }

    public Integer getPrice() {
        if (this.price == 0) {
            return null;
        } else {
            return this.price;
        }
    }

    public void setName(String newProductName){
        if(!newProductName.equals(productName)){
            productName = newProductName;
        }
    }

    public void setDescription(String newProductDescription){
        if(!newProductDescription.equals(productDescription)){
            productDescription = newProductDescription;
        }
    }

    public void setPrice(Integer newProductPrice){
        if(price != newProductPrice){
            price = newProductPrice;
        }
    }
}