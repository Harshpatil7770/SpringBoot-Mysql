package com.xoriant.delivery.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private int productId;

	private String productName;

	private double productPrice;

	private String description;

	private int quantity;

	private Brand brand;

	private Category category;

}
