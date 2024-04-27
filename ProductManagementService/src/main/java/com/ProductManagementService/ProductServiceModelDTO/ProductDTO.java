package com.ProductManagementService.ProductServiceModelDTO;

import java.math.BigDecimal;

import com.ProductManagementService.ProductServiceModel.Product;

import Commons.SharedEnums.ArtType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private ArtType artType;
    private String artist; 
    
	public ProductDTO(Long id, String name, String description, BigDecimal price, ArtType artType, String artist) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.artType = artType;
		this.artist = artist;
	}
	
	public ProductDTO(Product prod) {
		super();
		this.id = prod.getId();
		this.name = prod.getName();
		this.description = prod.getDescription();
		this.price = prod.getPrice();
		this.artType = prod.getArtType();
		this.artist = prod.getArtist();
		
	}
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
     
}
