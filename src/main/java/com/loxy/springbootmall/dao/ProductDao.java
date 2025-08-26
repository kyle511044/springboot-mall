package com.loxy.springbootmall.dao;

import com.loxy.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
