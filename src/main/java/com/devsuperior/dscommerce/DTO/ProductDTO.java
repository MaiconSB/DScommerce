package com.devsuperior.dscommerce.DTO;

import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.entities.Product;

import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {
	private Long id;
	
	@NotBlank
	@NotNull(message = "Campo requerido")
	@Size(min = 3, max = 80, message = "Nome precisa ter entre 3 a 80 caracteres")
	private String name;

	@NotNull(message = "Campo requerido")
	@Positive(message = "O preço do produto precisa ser positivo")
	private Double price;
	
	@Size(min = 10, message = "Descrição precisa ter pelo menos 10 caracteres")
	private String description;
	private String imgUrl;

	@NotEmpty(message = "Deve ter pelo menos uma categoria")
	private List<CategoryDTO> categories = new ArrayList<>();
	
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

		for(Category cat : entity.getCategories()) {
			categories.add(new CategoryDTO(cat));
		}
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

	public List<CategoryDTO> getCategories() {
		return categories;
	}
}
