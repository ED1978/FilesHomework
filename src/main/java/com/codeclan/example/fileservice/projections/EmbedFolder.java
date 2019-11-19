package com.codeclan.example.fileservice.projections;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    Double getSize();
    Folder getFolder();
}
