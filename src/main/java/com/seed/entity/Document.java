package com.seed.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
    private Integer docId;
    private String title;
    private String author;
    private String content;
}
