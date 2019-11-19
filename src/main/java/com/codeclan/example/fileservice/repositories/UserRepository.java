package com.codeclan.example.fileservice.repositories;


import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.projections.EmbedFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(excerptProjection = EmbedFolders.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
