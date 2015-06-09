package com.softdive.madpiggy.app.client.model.helper;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogHelper {
	
	public static Collection<String> categoryToList(Category category) {
		Collection<String> categoryList = new ArrayList<>();
		categoryList.add(category.getName());
		if (category.getChildren() != null) {
			categoryToListInternal(category, categoryList);
		}
		return categoryList;
	}
	
	private static void categoryToListInternal(Category category, Collection<String> list) {
		for (Category c : category.getChildren()) {
			list.add(c.getName());
			if (c.getChildren() != null) {
				categoryToListInternal(c, list);
			} 
		}
	}
	
	

}
