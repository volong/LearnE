package com.project.rest;

import com.project.impl.TextServiceImpl;
import com.project.model.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class TextRest {

    @Autowired
    private TextServiceImpl textService;

    @GetMapping(value = "/texts/{is_delete}")
    public List<Text> findAll(@Param("is_delete") Long is_delete) {
        return textService.findAll(is_delete);
    }

    @GetMapping(value = "text/{id_text}")
    public Text findById(@Param("id_text") Long id_text) {
        return textService.findById(id_text);
    }

    @PostMapping(value = "text")
    void create(@RequestBody Text text) {
        textService.create(text);
    }
}
