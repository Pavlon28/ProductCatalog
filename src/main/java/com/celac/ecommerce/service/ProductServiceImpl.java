package com.celac.ecommerce.service;

import com.celac.ecommerce.entity.Product;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

/** Created by user on 8/4/2015. */
@Service
public class ProductServiceImpl implements ProductService {
  @Override
  public List<Product> findAll() {
    return Collections.emptyList();
  }

  @Override
  public Product findById(Integer productId) {
    return null;
  }

  @Override
  public void addProduct(Product product) {}

  @Override
  public void editProduct(Product product, Integer productId) {}

  @Override
  public void removeProduct(Integer productId) {}
}
