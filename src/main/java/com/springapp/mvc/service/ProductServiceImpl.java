package com.springapp.mvc.service;

import com.springapp.mvc.dao.ProductDAO;
import com.springapp.mvc.dao.ProductsDaoImpl;
import com.springapp.mvc.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by user on 8/4/2015.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService
{
    /*
     * It will be wired with ProductRepositoryDB, because it has @Repository annotation
     *
     */
    @Autowired
    private ProductDAO productDAO;



    @Override
    @Transactional
    public List<Product> findAll()
    {
        return productDAO.findAll();
    }

    @Override
    @Transactional
    public Product findById(Integer productId)
    {
        return productDAO.findById(productId);
    }

    @Override
    @Transactional
    public void addProduct(Product product)
    {
        productDAO.addProduct(product);
    }

    @Override
    @Transactional
    public void editProduct(Product product, Integer productId)
    {
        productDAO.editProduct(product,productId);
    }

    @Override
    @Transactional
    public void removeProduct(Integer productId)
    {
        productDAO.removeProduct(productId);
    }
}
