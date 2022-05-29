package com.xoriant.delivery.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.delivery.model.Category;
import com.xoriant.delivery.util.DBqueries;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Category addNewCategory(Category category) {
		int result = jdbcTemplate.update(DBqueries.ADD_NEW_CATEGORY, category.getCategoryId(),
				category.getCategoryName());
		log.info("addNewCategory() called");
		if (result != 0) {
			return category;
		}
		return null;
	}

	@Override
	public String updateCategory(Category category) {
		int result = jdbcTemplate.update(DBqueries.UPDATE_CATEGORY, category.getCategoryName(),
				category.getCategoryId());
		if (result != 0) {
			System.out.println(result);
			return "category updated succesfully !";
		}
		return null;
	}

	@Override
	public List<Category> addNewListsOfCategories(List<Category> catLists) {
		for (Category category : catLists) {
			int result = jdbcTemplate.update(DBqueries.ADD_NEW_CATEGORY, category.getCategoryId(),
					category.getCategoryName());
		}
		return catLists;
	}

	@Override
	public List<Category> updateListsOfCategory(List<Category> catLists) {

		for (Category category : catLists) {
			int result = jdbcTemplate.update(DBqueries.UPDATE_CATEGORY, category.getCategoryName(),
					category.getCategoryId());
		}
		return catLists;

	}

	@Override
	public String deleteCategory(int categoryId) {
		int result = jdbcTemplate.update(DBqueries.DELETE_CATEGORY, categoryId);
		if (result != 0) {
			return "Delete Succesfully !";
		}
		return null;
	}

	@Override
	public List<Category> fetchAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findById(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findByName(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

}
