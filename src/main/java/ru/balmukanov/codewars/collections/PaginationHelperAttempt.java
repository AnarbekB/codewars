package ru.balmukanov.codewars.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * For this exercise you will be strengthening your page-fu mastery. You will complete the PaginationHelper class,
 * which is a utility class helpful for querying paging information related to an array.
 *
 * The class is designed to take in an array of values and an integer indicating how many items will be allowed per
 * each page. The types of values contained within the collection/array are not relevant.
 *
 * The following are some examples of how this class is used:
 * PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
 * helper.pageCount(); //should == 2
 * helper.itemCount(); //should == 6
 * helper.pageItemCount(0); //should == 4
 * helper.pageItemCount(1); // last page - should == 2
 * helper.pageItemCount(2); // should == -1 since the page is invalid
 *
 * pageIndex takes an item index and returns the page that it belongs on
 * helper.pageIndex(5); //should == 1 (zero based index)
 * helper.pageIndex(2); //should == 0
 * helper.pageIndex(20); //should == -1
 * helper.pageIndex(-10); //should == -1
 *
 * https://www.codewars.com/kata/515bb423de843ea99400000a/train/java
 *
 * @param <I>
 */
public class PaginationHelperAttempt<I> implements PaginationHelper<I> {

    private final List<I> store;

    private final int itemsPerPage;

    private final int pageCount;

    private final Map<Integer, Integer> pageCountAssociation = new HashMap<>();

    public PaginationHelperAttempt(List<I> collection, int itemsPerPage) {
        this.store = collection;
        this.itemsPerPage = itemsPerPage;
        int test =  this.store.size() / this.itemsPerPage;
        if (this.store.size() % this.itemsPerPage != 0) {
            this.pageCount = this.store.size() % this.itemsPerPage;
        } else {
            this.pageCount = this.store.size() / this.itemsPerPage;
        }

        int storeCount = this.itemCount();
        for (int i = 0; i < this.pageCount(); i++) {
            if (storeCount > itemsPerPage) {
                this.pageCountAssociation.put(i, itemsPerPage);
            } else {
                this.pageCountAssociation.put(i, storeCount);
            }
            storeCount -= itemsPerPage;
        }
    }

    @Override
    public int itemCount() {
        return this.store.size();
    }

    @Override
    public int pageCount() {
        return this.pageCount;
    }

    @Override
    public int pageItemCount(int pageIndex) {
        if (this.pageCount() < pageIndex + 1) {
            return -1;
        }

        return this.pageCountAssociation.get(pageIndex);
    }

    @Override
    public int pageIndex(int itemIndex) {
        if (itemIndex > this.itemCount() || itemIndex < 0) {
            return -1;
        }

        if (itemIndex < this.itemsPerPage) {
            int pageCount1 = itemIndex / this.itemsPerPage;
            return pageCount1;
        }

        int pageCount = itemIndex % this.itemsPerPage;
        return pageCount;
    }
}
