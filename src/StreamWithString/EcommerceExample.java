package StreamWithString;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category='" + category + "'}";
    }
}

public class EcommerceExample {
    public static void main(String[] args) {
        // List of products on an e-commerce platform
        List<Product> products = Arrays.asList(
                new Product("Laptop", 800, "Electronics"),
                new Product("Shirt", 300, "Clothing"),
                new Product("Phone", 600, "Electronics"),
                new Product("Watch", 150, "Accessories"),
                new Product("Headphones", 200, "Electronics")
        );

        // Grouping products by category
        Map<String, List<Product>> groupedByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        // Display the grouped products
        groupedByCategory.forEach((category, productList) -> {
            System.out.println(category + ": " + productList);
        });
    }
}
