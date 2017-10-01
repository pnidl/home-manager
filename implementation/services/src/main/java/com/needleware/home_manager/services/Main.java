package com.needleware.home_manager.services;

import com.needleware.home_manager.api.IItemCategoryService;
import com.needleware.home_manager.api.IItemService;
import com.needleware.home_manager.model.Item;
import com.needleware.home_manager.model.ItemCategory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final int ITEM_COUNT = 30;
    private static final int ITEM_CATEGORY_COUNT = 5;

    private static IItemCategoryService itemCategoryService = new ItemCategoryService();
    private static IItemService itemService = new ItemService();

    public static void main(String[] args) {
        for (int i = 0; i < ITEM_CATEGORY_COUNT; i++) {
            ItemCategory itemCategory = new ItemCategory();
            itemCategory.setName("ItemCategory-" + i);
            itemCategoryService.create(itemCategory);
        }

        List<ItemCategory> itemCategories = itemCategoryService.list();

        for (int i = 0; i < ITEM_COUNT; i++) {
            Item item = new Item();
            item.setName("Item-" + i);
            item.setCategory(itemCategories.get(i % itemCategories.size()));
            itemService.create(item);
        }

        for (ItemCategory itemCategory : itemCategories) {
            LOGGER.info("Category {} contains items:", itemCategory);
            for (Item item : itemService.getByCategoryID(itemCategory.getId())) {
                LOGGER.info("{}", item);
            }
        }
    }
}
