package com.example.bigprojecttinqin.response;

import com.example.bigprojecttinqin.entity.Multimedia;
import com.example.bigprojecttinqin.entity.Tag;
import com.example.bigprojecttinqin.entity.Vendor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class ItemOutput {
    private UUID it;
    private String title;
    private String description;
    private Vendor vendor;
    private Set<Multimedia> multimedia;
    private Set<Tag> tag;
    private boolean archive;
}
