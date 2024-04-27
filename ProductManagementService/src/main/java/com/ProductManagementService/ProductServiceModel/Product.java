package com.ProductManagementService.ProductServiceModel;

import java.math.BigDecimal;

import Commons.SharedEnums.ArtType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "product_id")
	    private Long id;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "description")
	    private String description;

	    @Column(name = "price")
	    private BigDecimal price;

	    @Column(name = "art_type")
	    private ArtType artType;
	    
	    @Column(name = "artist")
	    private String artist;

		public Product(Long id, String name, String description, BigDecimal price, ArtType artType, String artist) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.price = price;
			this.artType = artType;
			this.artist = artist;
		}

		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}    

}
