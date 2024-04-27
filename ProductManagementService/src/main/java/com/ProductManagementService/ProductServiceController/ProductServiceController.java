package com.ProductManagementService.ProductServiceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProductManagementService.ProductServiceModelDTO.ProductDTO;
import com.ProductManagementService.ProductServiceServices.ProductServiceServices;

@RestController
@RequestMapping("/Products")
public class ProductServiceController {
	
	@Autowired
	private ProductServiceServices productService;

	@PostMapping
	public ResponseEntity<ProductDTO> CreateProduct(@RequestBody ProductDTO productDTO) {
		ProductDTO createdProductDTO = productService.createProduct(productDTO);
		return ResponseEntity.ok(createdProductDTO);
	}
	
	
	@GetMapping
	public ResponseEntity<ProductDTO> getProductById(@RequestBody Long Id){
		
		ProductDTO product = productService.getProductById(Id);
		
		return ResponseEntity.ok(product);
	}
	
	
}
