package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "http://localhost:3000")

public class CartController {
  private final List<Product> cart = new ArrayList<>();
  @PostMapping
    public List<Product> addToCart(@RequestBody Product product){
      cart.add(product);
      return cart;
  }
  @GetMapping
    public List<Product> viewCart(){
      return cart;
  }
}
