package com.ProductManagementService.ProductServiceRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProductManagementService.ProductServiceModel.Product;
 
@Repository
public interface ProductServiceRepository extends JpaRepository<Product, Long>{

	
}

