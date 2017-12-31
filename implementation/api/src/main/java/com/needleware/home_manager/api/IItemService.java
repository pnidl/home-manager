package com.needleware.home_manager.api;

import com.needleware.home_manager.model.inventory.Item;

import java.util.List;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public interface IItemService extends ICommonCRUDService<Item> {

    List<Item> getByCategoryID(String categoryID);

}
