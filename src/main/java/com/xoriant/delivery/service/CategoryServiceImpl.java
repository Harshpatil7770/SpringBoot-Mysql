package com.xoriant.delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.delivery.dao.CategoryDao;
import com.xoriant.delivery.exception.ElementNotFoundException;
import com.xoriant.delivery.exception.InputUserException;
import com.xoriant.delivery.model.Category;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao categoryDao;

	@Override
	public String addNewCategory(Category category) {
		if (category.getCategoryName().isBlank() || category.getCategoryName().isEmpty()) {
			throw new InputUserException();
		}
		categoryDao.addNewCategory(category);
		log.info("addNewCategory() called");
		String response = "New Category Added!";
		return response;
	}

	@Override
	public String updateCategory(Category category) {

		categoryDao.updateCategory(category);
		log.info("updateCategory() called");
		String response = "Update Category Succesfully!";
		return response;

	}

	@Override
	public String addNewListsOfCategories(List<Category> catLists) {
		categoryDao.addNewListsOfCategories(catLists);
		log.info("addNewListsOfCategories() called");
		String response = "addNewListsOfCategories Succesfully!";
		return response;
	}

	@Override
	public String updateListsOfCategory(List<Category> catLists) {
		categoryDao.updateListsOfCategory(catLists);
		log.info("addNewListsOfCategories() called");
		String response = "updateListsOfCategory Succesfully!";
		return response;
	}

	@Override
	public String deleteCategory(int categoryId) {
		categoryDao.deleteCategory(categoryId);
		log.info("deleteCategory() called");
		String response = "deleteCategory Succesfully!";
		return response;
	}

	@Override
	public List<Category> fetchAllCategories() {
		return categoryDao.fetchAllCategories();
	}

	@Override
	public Category findById(int categoryId) {
		return categoryDao.findById(categoryId);
	}

	@Override
	public Category findByName(String categoryName) {
		return categoryDao.findByName(categoryName);
	}

}
