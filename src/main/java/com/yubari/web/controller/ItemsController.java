package com.yubari.web.controller;

import com.yubari.domain.Items;
import com.yubari.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private IItemsService itemsService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<Items> allItems = itemsService.findAllItems();
        model.addAttribute("Items", allItems);
        System.out.println(allItems);
        return "/items/itemsList";
    }

    @RequestMapping("/delete")
    public String delete(Model model, int id) {
        itemsService.deleteById(id);
        return "/items/itemsList";
    }

    @RequestMapping("/edit")
    public String edit(int id, Model model) {
        Items items = itemsService.findById(id);
        if (items != null) model.addAttribute("items", items);
        System.out.println(items);
        return "/items/edit";
    }

    @RequestMapping("/update")
    public String update(Items items) {
        items.setCreatetime(new Date());
        itemsService.saveOrUpdate(items);
        return "forward:list.do";
    }
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("myname","Lian");
        return "/items/hello";
    }

}
