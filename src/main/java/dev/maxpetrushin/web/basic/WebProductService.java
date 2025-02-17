package dev.maxpetrushin.web.basic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebProductService {
    private final List<WebProduct> products = new ArrayList<>();

    public void addProduct(String name, double price) {
        WebProduct newProduct = new WebProduct(name, price);
        products.add(newProduct);
    }

    public List<WebProduct> findAll() {
        return products;
    }
}
