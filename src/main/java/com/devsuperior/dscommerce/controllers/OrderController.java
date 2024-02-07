package com.devsuperior.dscommerce.controllers;

import com.devsuperior.dscommerce.DTO.OrderDTO;
import com.devsuperior.dscommerce.DTO.ProductDTO;
import com.devsuperior.dscommerce.DTO.ProductMinDTO;
import com.devsuperior.dscommerce.services.OrderService;
import com.devsuperior.dscommerce.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	
	@Autowired
	private OrderService service;

	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_CLIENT')")
	@GetMapping(value = "/{id}")
	public ResponseEntity<OrderDTO> findById(@PathVariable Long id) {
		OrderDTO dto = service.findByID(id);
		return ResponseEntity.ok(dto);
	}




}
