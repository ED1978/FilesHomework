package com.codeclan.example.fileservice.projections;

import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "embedFolders", types = User.class)
public interface EmbedFolders {
    String getName();
    ArrayList<Folder> getFolders();
}
