package com.codeclan.example.fileservice.projections;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    ArrayList<File> getFiles();
    User getUser();
}
