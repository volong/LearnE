package com.project.service;

import com.project.model.Text;

import java.util.List;

public interface TextService {

    List<Text> findAll(Long is_delete);

    Text findById(Long id_text);

    void create (Text text);
}
