package com.example.bai5.controller;

import org.apache.tomcat.jni.File;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


@Controller
public class ImageController {
    @GetMapping("/upload")
    public String upload(){
        return "uploadForm";
    }

    @PostMapping("/upload")
    public String upload(ModelMap model,@RequestParam("image") MultipartFile image){
        if(image.isEmpty()){
            model.addAttribute("message", "Please upload an image!");
        }
        Path path = Paths.get("imagess");

        try(InputStream inputStream = image.getInputStream()){
            Files.copy(inputStream, path.resolve(image.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("message", "Error: "+e.getMessage());
        }
        return "uploadForm";
    }
}
