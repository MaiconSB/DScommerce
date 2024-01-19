package com.devsuperior.dscommerce.DTO;

import com.devsuperior.dscommerce.entities.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 80, message = "Nome precisa ter entre 3 a 80 caracteres")
	private String name;
	
	@Positive(message = "O preço do produto precisa ser positivo")
	private Double price;
	
	@Size(min = 10, message = "Descrição precisa ter pelo menos 10 caracteres")
	private String description;
	private String imgUrl;
	
	public ProductDTO() {}
	
	public ProductDTO(Long id, String name, Double price, String description, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imgUrl = imgUrl;
	}

	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		description = entity.getDescription();
		imgUrl = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public String getImgUrl() {
		return imgUrl;
	}
	
	
	
	
}
