package lesson6.Lesson6task2;

import java.util.List;

public interface Basket {
    List<String> getProducts();

    int getProductQuantity(String product);
    void addProduct(String product, int quantity);
    void removeProduct(String product);
    void updateProductQuantity(String product, int quantity);
    void clear();


}
