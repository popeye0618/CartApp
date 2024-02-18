package cartapp;

import java.util.Objects;

public class Product {

    private int key;
    private String name;
    private int price;

    public Product(int key, String name, int price) {
        this.key = key;
        this.name = name;
        this.price = price;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(key, product.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
