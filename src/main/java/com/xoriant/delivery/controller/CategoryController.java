package com.xoriant.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.delivery.model.Category;
import com.xoriant.delivery.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/categories")
@Slf4j
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@PostMapping("/save")
	public ResponseEntity<String> addNewCategory(@RequestBody Category category) {
		log.info("addNewCategory() called");
		String response = categoryService.addNewCategory(category);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateCategory(@RequestBody Category category) {
		log.info("addNewCategory() called");
		String response = categoryService.updateCategory(category);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PostMapping("/saveAll")
	public ResponseEntity<String> addNewListsOfCategory(@RequestBody List<Category> catLists) {
		log.info("addNewListsOfCategory() called");
		String response = categoryService.addNewListsOfCategories(catLists);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PutMapping("/updateAll")
	public ResponseEntity<String> updateListsOfCategory(@RequestBody List<Category> catLists) {
		log.info("updateListsOfCategory() called");
		String response = categoryService.updateListsOfCategory(catLists);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{categoryId}")
	public ResponseEntity<String> deleteCategory(@PathVariable int categoryId) {
		log.info("deleteCategory() called");
		String response = categoryService.deleteCategory(categoryId);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
