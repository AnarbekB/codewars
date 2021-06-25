package ru.balmukanov.codewars.collections;

import java.util.List;

public interface PaginationHelper<I> {

    int itemCount();

    int pageCount();

    int pageItemCount(int pageIndex);

    int pageIndex(int itemIndex);

}
