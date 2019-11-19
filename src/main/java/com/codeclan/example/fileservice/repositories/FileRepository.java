package com.codeclan.example.fileservice.repositories;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
