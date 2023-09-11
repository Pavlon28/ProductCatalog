package com.celac.ecommerce.service;

import com.celac.ecommerce.entity.Category;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** Created by user on 8/5/2015. */
@Service
public class CategoryServiceImpl implements CategoryService {

  @Override
   public List<Category> findAll() {
    return Collections.emptyList();
  }

  @Override
   public Category findById(Integer categoryId) {
    return null;
  }

  @Override
  public void addCategory(Category category) {

  }

  @Override
  public void editCategory(Category category, Integer categoryId) {

  }

  @Override
  public void removeCategory(Integer categoryId) {

  }
}
