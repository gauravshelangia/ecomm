package com.coviam.ecomm.service;

import com.coviam.ecomm.dao.CategoryRepository;
import com.coviam.ecomm.dao.MerchantRepository;
import com.coviam.ecomm.dao.ProductRepository;
import com.coviam.ecomm.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by gaurav on 03/06/17.
 */
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private MerchantRepository merchantRepository;


}
