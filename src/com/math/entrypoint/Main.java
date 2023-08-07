package com.math.entrypoint;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.math.entities.Product;
import com.math.entities.ProductType;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        
        products.add(new Product("Sabão", 10, ProductType.CLEANING));
        products.add(new Product("Macarrão", 16, ProductType.FOOD));
        products.add(new Product("Panela", 5, ProductType.OTHERS));

        List<String> productsWithQuantityLessthan10 = products.stream()
            .filter(product -> product.getQuantity() < 10)
            .map(Product::getName)
            .collect(Collectors.toList());

        System.out.println(productsWithQuantityLessthan10);
    }
}
