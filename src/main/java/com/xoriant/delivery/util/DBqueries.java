package com.xoriant.delivery.util;

public class DBqueries {

	public static final String ADD_NEW_CATEGORY = "insert into categories values(?,?)";

	public static final String UPDATE_CATEGORY = "update categories set category_name=? where category_id=?";

	public static final String FIND_CATEGORY_BY_ID = "select * from categories where category_id=?";

	public static final String DELETE_CATEGORY = "delete from categories where category_id=?";
}
