package com.xoriant.delivery.service;

import java.util.List;
import java.util.Optional;

import com.xoriant.delivery.model.Category;

public interface CategoryService {

	String addNewCategory(Category category);

	String updateCategory(Category category);

	String addNewListsOfCategories(List<Category> catLists);

	String updateListsOfCategory(List<Category> catLists);

	String deleteCategory(int categoryId);

	List<Category> fetchAllCategories();

	Category findById(int categoryId);

	Category findByName(String categoryName);
}
