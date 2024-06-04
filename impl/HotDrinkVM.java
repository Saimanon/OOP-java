package less1.practice.impl;

import less1.practice.HotDrink;
import less1.practice.Product;
import less1.practice.VendingMachine;
import java.util.List;

public class HotDrinkVM extends VendingMachine {

    public HotDrinkVM() {
        super();
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name) && hotDrink.getTemperature() == temperature) {
                    products.remove(product);
                    return hotDrink;
                }
            }
        }
        System.out.println("Нет такого напитка: " + name + " с температурой: " + temperature);
        return null;
    }
}
