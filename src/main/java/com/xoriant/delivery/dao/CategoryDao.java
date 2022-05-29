package com.xoriant.delivery.dao;

import java.util.List;
import java.util.Optional;

import com.xoriant.delivery.model.Category;

public interface CategoryDao {

	Category addNewCategory(Category category);

	String updateCategory(Category category);

	List<Category> addNewListsOfCategories(List<Category> catLists);

	List<Category> updateListsOfCategory(List<Category> catLists);

	String deleteCategory(int categoryId);

	List<Category> fetchAllCategories();

	Category findById(int categoryId);

	Category findByName(String categoryName);
}
