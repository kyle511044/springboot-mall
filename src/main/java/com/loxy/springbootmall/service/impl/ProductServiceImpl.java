package com.loxy.springbootmall.service.impl;

import com.loxy.springbootmall.dao.ProductDao;
import com.loxy.springbootmall.model.Product;
import com.loxy.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
