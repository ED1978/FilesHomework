package com.codeclan.example.fileservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @JsonIgnoreProperties("folder")
    @OneToMany(mappedBy = "folder")
    private List<File> files;
    @JsonIgnoreProperties(value = "folders")
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Folder(String title, User user){
        this.title = title;
        this.files = new ArrayList<File>();
        this.user = user;
    }

    public Folder(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addFile(File file){
        this.files.add(file);
    }
}
