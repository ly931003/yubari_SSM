package com.yubari.web.controller;

import com.yubari.domain.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/pictureUpload")
    public void list(HttpServletRequest request, PrintWriter writer) {
        MultipartHttpServletRequest fileRequest = (MultipartHttpServletRequest) request;
        MultipartFile uploadFile = fileRequest.getFile("itemspic1");
        String uploadFolder = request.getServletContext().getRealPath("/upload");
        File folder = new File(uploadFolder);
        if (!folder.exists()) folder.mkdir();
        Assert.notNull(uploadFile, "Upload File is null!");
        String suffix = uploadFile.getOriginalFilename().split("\\.")[1];
        String newFilename = UUID.randomUUID().toString() + "." + suffix;
        File newFile = new File(uploadFolder + "\\" + newFilename);
        try {
            FileCopyUtils.copy(uploadFile.getInputStream(), new FileOutputStream(newFile));
            System.out.println("Okey!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something Wrong!");
        }
        String imgUrl = "Http://localhost/upload/" + newFilename;
        String respJson = "{\"imgUrl\":\"" + imgUrl + "\"}";
        System.out.println(newFile);
        System.out.println(respJson);
        writer.write(respJson);
    }
}
