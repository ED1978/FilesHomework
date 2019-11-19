package com.codeclan.example.fileservice.components;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.repositories.FileRepository;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Folder photos = new Folder("Photos");
        folderRepository.save(photos);
        Folder music = new Folder("Music");
        folderRepository.save(music);
        File family = new File("Family Portrait", ".jpeg", 3.46, photos);
        fileRepository.save(family);
        File house = new File("Aerial House", ".jpeg", 4.78, photos);
        fileRepository.save(house);
        File stepOn = new File("Step On - Happy Mondays", ".mp3", 5.45, music);
        fileRepository.save(stepOn);
        File comeTogether = new File("Come Together - The Beatles", ".mp3", 4.98, music);
        fileRepository.save(comeTogether);

    }

}
