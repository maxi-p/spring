package dev.maxpetrushin.web.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WebProductController {
    private final WebProductService productService;

    @Autowired
    public WebProductController(WebProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String viewProducts(Model model) {
        List<WebProduct> products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @RequestMapping(path = "/products",
            method = RequestMethod.POST)
    public String addProduct(@RequestParam String name,
                             @RequestParam double price,
                             Model model) {
        productService.addProduct(name, price);

        List<WebProduct> products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

}
