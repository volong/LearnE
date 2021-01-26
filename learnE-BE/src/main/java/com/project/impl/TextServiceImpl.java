package com.project.impl;

import com.project.model.Text;
import com.project.repository.TextRepository;
import com.project.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TextServiceImpl implements TextService {

    @Autowired
    private TextRepository textRepository;

    @Override
    public List<Text> findAll(Long is_delete) {
        return textRepository.findAll(is_delete);
    }

    @Override
    public Text findById(Long id_text) {
        return textRepository.findById(id_text);
    }

    @Override
    public void create(Text text) {
        textRepository.create(text);
    }
}
