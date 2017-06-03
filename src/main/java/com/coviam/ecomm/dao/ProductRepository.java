package com.coviam.ecomm.dao;

import com.coviam.ecomm.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by gaurav on 03/06/17.
 */

public interface ProductRepository extends CrudRepository<Product,Long>{

    List<Product> findByName(String name);



}
