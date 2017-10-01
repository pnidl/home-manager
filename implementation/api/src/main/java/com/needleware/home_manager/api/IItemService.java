package com.needleware.home_manager.api;

import com.needleware.home_manager.model.Item;
import com.needleware.home_manager.model.ItemCategory;

import java.util.List;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public interface IItemService extends ICommonCRUDService<Item> {

    List<Item> getByCategoryID(String itemCategoryID);

}
