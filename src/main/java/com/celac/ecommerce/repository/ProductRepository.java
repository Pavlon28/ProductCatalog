package com.celac.ecommerce.repository;

import com.celac.ecommerce.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author scelac
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
  @Query("SELECT p  from  Product p where p.featured = true")
  List<Product> findFeaturedProducts();
}
