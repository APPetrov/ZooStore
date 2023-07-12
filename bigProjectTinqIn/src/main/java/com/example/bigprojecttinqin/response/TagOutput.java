package com.example.bigprojecttinqin.response;

import com.example.bigprojecttinqin.entity.Item;

import java.util.Set;
import java.util.UUID;

public class TagOutput {
    private UUID id;
    private String title;
    private Set<Item> items;
}
