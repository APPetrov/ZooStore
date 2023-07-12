package com.example.bigprojecttinqin.services;

import com.example.bigprojecttinqin.request.ItemInput;
import com.example.bigprojecttinqin.response.ItemOutput;

import java.util.UUID;

public interface ItemService {
ItemOutput CreateItem(ItemInput ItemInput);
ItemOutput archiveItem(UUID id);
ItemOutput editItem(ItemOutput item);
}
