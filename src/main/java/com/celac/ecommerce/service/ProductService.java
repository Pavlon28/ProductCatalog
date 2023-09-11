package com.celac.ecommerce.service;

import com.celac.ecommerce.entity.Product;

import java.util.List;

/**
 * Created by user on 8/4/2015.
 */
public interface ProductService
{
    public List<Product> findAll();
    public Product findById(Integer productId);

    public void addProduct(Product product);
    public void editProduct(Product product, Integer productId);
    public void removeProduct(Integer productId);
}
