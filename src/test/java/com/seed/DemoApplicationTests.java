package com.seed;

import com.seed.entity.Document;
import com.seed.mapper.DocumentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    DocumentMapper mapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testInsert(){
        Document document = new Document();
        document.setTitle("这是标题");
        document.setAuthor("张阿水大厦");
        document.setContent("阿斯达四大所当代付款管理科");
        int ret = mapper.insertDocument(document);
        System.out.println(ret);
    }
}
