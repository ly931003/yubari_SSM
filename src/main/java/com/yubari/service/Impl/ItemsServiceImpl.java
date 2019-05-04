package com.yubari.service.Impl;

import com.yubari.domain.Items;
import com.yubari.mapper.ItemsMapper;
import com.yubari.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemsServiceImpl implements IItemsService {
    @Autowired
    private ItemsMapper itemsMapper;


    @Override
    public List<Items> findAllItems() {
        return itemsMapper.findAllList();
    }

    @Override
    public Items findById(int id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Items items) {
        if (items.getId() == null) {
            itemsMapper.insert(items);
        } else {
            itemsMapper.updateByPrimaryKey(items);
        }
    }

    @Override
    public void deleteById(int id) {
        itemsMapper.deleteByPrimaryKey(id);
    }

}
