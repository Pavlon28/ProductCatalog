package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by user on 8/4/2015.
 */
@Repository
public class ProductsDaoImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory; // session factory object

    public ProductsDaoImpl() {
    }

    public ProductsDaoImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    private Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }


    @Override

    public List<Product> findAll()
    {
        return getCurrentSession().createQuery("from Product").list();
    }

    @Override

    public Product findById(Integer productId)
    {
        return (Product)getCurrentSession().get(Product.class, productId);
    }

    @Override

    public void addProduct(Product product)
    {
        getCurrentSession().save(product);
    }

    @Override

    public void editProduct(Product product, Integer productId)
    {
        Product productToEdit = findById(productId);

        if(productToEdit != null)
        {
            productToEdit.setProductName(product.getProductName());
            productToEdit.setProductPrice(product.getProductPrice());
            productToEdit.setProductStock(product.getProductId());
            productToEdit.setProductDescription(product.getProductDescription());
            productToEdit.setCategory(product.getCategory());

            getCurrentSession().update(productToEdit);
        }
    }

    @Override

    public void removeProduct(Integer productId)
    {
        Product productToRemove = findById(productId);

        if(productToRemove != null)
        {
            getCurrentSession().delete(productToRemove);
        }
    }


}
