package com.ProductManagementService.ProductServiceServices;

import org.springframework.stereotype.Service;

import com.ProductManagementService.ProductServiceModel.Product;
import com.ProductManagementService.ProductServiceModelDTO.ProductDTO;
import com.ProductManagementService.ProductServiceRepository.ProductServiceRepository;


@Service
public class ProductServiceServices {
 
	ProductServiceRepository prodRepo;
	public ProductDTO createProduct(ProductDTO productDTO) {
		 
		return new ProductDTO();
	}
	
	public ProductDTO getProductById(Long Id) {
		Product prod  =prodRepo.getReferenceById(Id);
		 
		return new ProductDTO(prod);
	}
	

}
