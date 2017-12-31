package com.needleware.home_manager.services;

import com.needleware.home_manager.api.ICategoryService;
import com.needleware.home_manager.api.IItemService;
import com.needleware.home_manager.model.inventory.Category;
import com.needleware.home_manager.model.inventory.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final int ITEM_COUNT = 30;
    private static final int ITEM_CATEGORY_COUNT = 5;

    private static ICategoryService categoryService = new CategoryService();
    private static IItemService itemService = new ItemService();

    public static void main(String[] args) {
        for (int i = 0; i < ITEM_CATEGORY_COUNT; i++) {
            Category itemCategory = new Category();
            itemCategory.setName("ItemCategory-" + i);
            categoryService.create(itemCategory);
        }

        List<Category> categories = categoryService.list();

        for (int i = 0; i < ITEM_COUNT; i++) {
            Item item = new Item();
            item.setName("Item-" + i);
            item.setCategory(categories.get(i % categories.size()));
            itemService.create(item);
        }

        for (Category category : categories) {
            LOGGER.info("Category {} contains items:", category);
            for (Item item : itemService.getByCategoryID(category.getId())) {
                LOGGER.info("{}", item);
            }
        }
    }
}
