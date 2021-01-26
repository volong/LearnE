package com.project.repository;

import com.project.model.Text;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
public interface TextRepository extends PagingAndSortingRepository<Text, String> {
    @Query(value = "SELECT * FROM texts WHERE is_delete = :is_delete", nativeQuery = true)
    List<Text> findAll(@Param("is_delete") Long is_delete);

    @Query(value = "SELECT * FROM texts WHERE id_text = :id_text", nativeQuery = true)
    Text findById(@Param("id_text") Long id_text);

    @Query(value = "INSERT INTO texts (text_vn, text_en) VALUES (:text_vn, :text_en)", nativeQuery = true)
    void create(@RequestBody Text text);
}
