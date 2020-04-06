package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        products = delete(products, 1);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public static Product[] delete(Product[] products, int index) {
        products[index] = null;

        for (int i = 0; i < products.length - 1; i++) {
            if (products[i] == null) {
                products[i] = products[i + 1];
                products[i + 1] = null;
            }
        }

        return products;
    }
}
