package lesson6.Lesson6task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OneBasket implements Basket {
    Map map = new HashMap();

    @Override
    public void addProduct(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        for (int i = 0; i < getProducts().size(); i++) {
            if(map.containsKey(product)){
                map.remove(product);
            }
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
      map.put(product, quantity);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> list = new ArrayList<>();
        list.addAll(map.keySet());
        return list;
    }

    @Override
    public int getProductQuantity(String product) {
        int quantity = Integer.parseInt(product);
        return quantity;
    }
}
