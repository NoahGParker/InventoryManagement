package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Optional;
@Controller
public class BuyController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/buy")
    public String buy(@RequestParam("productId") Long productId) {

        Optional<Product> purchaseProd = productRepository.findById(productId);

        if (purchaseProd.isPresent()) {
            Product product = purchaseProd.get();

            if (product.getInv() > 0) {
                product.setInv(product.getInv() - 1);
                productRepository.save(product);
                return "sucpurchase";
            } else {
                return "failedpurchase";
            }
        } else {
            return "failedpurchase";
        }
    }
}
