package com.celac.ecommerce.repository;

import com.celac.ecommerce.entity.Product;
import org.springframework.data.repository.CrudRepository;
/**
 * @author scelac
 */
public interface ProductRepository extends CrudRepository<Product, Long> {}
