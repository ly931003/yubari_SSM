package com.yubari.service;

import com.yubari.domain.Items;

import java.util.List;
public interface IItemsService {
    List<Items> findAllItems();
    Items findById(int id);
    void saveOrUpdate(Items items);
    void deleteById(int id);
}
