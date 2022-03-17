package com.seed.controller;

import com.seed.entity.Document;
import com.seed.mapper.DocumentMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DocumentController {
    @Resource
    DocumentMapper mapper;

    @PostMapping("/list")
    public List<Document> list(){
        return mapper.getList();
    }

    @PostMapping("/getListByAuthor")
    public List<Document> getListByAuthor(String author){
        return mapper.getDocByAuthor(author);
    }

    @PostMapping("/getListByTitle")
    public List<Document> getListByTitle(String title){
        return mapper.getDocByTitle(title);
    }

    @PostMapping("/insert")
    public Integer Insert(String title,String author,String content){
        Document document = new Document();
        document.setTitle(title);
        document.setAuthor(author);
        document.setContent(content);
        return mapper.insertDocument(document);
    }
}
