package com.example.bigprojecttinqin.response;

import com.example.bigprojecttinqin.entity.Item;

import java.util.Set;
import java.util.UUID;

public class VendorOutput {
    private UUID id;
    private String name;
    private String phone;
    private Set<Item> items;
}
