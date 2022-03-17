package com.seed.mapper;

import com.seed.entity.Document;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DocumentMapper {
    List<Document> getList();
    List<Document> getDocByAuthor(String author);
    List<Document> getDocByTitle(String title);
    Integer insertDocument(Document document);
}
