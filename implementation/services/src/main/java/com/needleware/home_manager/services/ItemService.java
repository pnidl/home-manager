package com.needleware.home_manager.services;

import com.needleware.home_manager.api.IItemService;
import com.needleware.home_manager.model.AEntity;
import com.needleware.home_manager.model.Item;
import com.needleware.home_manager.model.ItemCategory;

import java.util.*;

/**
 * TODO: class description
 *
 * @author Petr Nídl
 */
public class ItemService extends AInMemoryCommonCRUDService<Item> implements IItemService {

    // region Fields

    private final Map<String, List<String>> idsByCategory = new HashMap<>();

    // endregion

    // region ICommonCRUDService

    @Override
    public String create(Item entity) {
        String id = super.create(entity);
        String categoryID = null;
        ItemCategory category = entity.getCategory();
        if (category != null) {
            categoryID = category.getId();
        }
        List<String> itemIDs = idsByCategory.computeIfAbsent(categoryID, k -> new LinkedList<>());
        itemIDs.add(id);
        return id;
    }

    @Override
    public Item update(Item entity) {
        String id = entity.getId();
        Item previousState = super.findByID(id);
        String previousCategoryID = previousState.getCategory() == null ? null : previousState.getCategory().getId();
        String newCategoryID = entity.getCategory() == null ? null : entity.getCategory().getId();
        if (!nullableEquals(previousCategoryID, newCategoryID)) {
            List<String> previousCategoryList = idsByCategory.get(previousCategoryID);
            previousCategoryList.remove(id);
            List<String> newCategoryList = idsByCategory.computeIfAbsent(newCategoryID, k -> new LinkedList<>());
            newCategoryList.add(id);
        }
        return super.update(entity);
    }

    @Override
    public Item findByID(String id) {
        return super.findByID(id);
    }

    @Override
    public List<Item> list() {
        return super.list();
    }

    @Override
    public void deleteByID(String id) {
        Item previousState = super.findByID(id);
        String previousCategoryID = previousState.getCategory() == null ? null : previousState.getCategory().getId();
        if (previousCategoryID != null) {
            List<String> previousCategoryList = idsByCategory.get(previousCategoryID);
            previousCategoryList.remove(id);
            List<String> newCategoryList = idsByCategory.putIfAbsent(null, new LinkedList<>());
            newCategoryList.add(id);
        }
        super.deleteByID(id);
    }


    // endregion


    // region IItemService

    @Override
    public List<Item> getByCategoryID(String itemCategoryID) {
        List<String> itemIDs = idsByCategory.get(itemCategoryID);
        return new ArrayList<>(findByIDs(itemIDs));
    }

    // endregion

    // region Collaborators

    private boolean nullableEquals(Object e1, Object e2) {
        return e1 == e2 || e1 != null && e1.equals(e2);
    }

    // endregion
}
