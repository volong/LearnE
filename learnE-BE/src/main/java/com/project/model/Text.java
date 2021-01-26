package com.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "texts")
public class Text {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_text;

    private String text_vn;

    private String text_en;

    private Long is_delete;

    @JsonIgnore
    @OneToMany(mappedBy = "text")
    private Set<Video> videoSet;

    public Text() {
    }

    public Text(Long id_text, String text_vn, String text_en, Long is_delete) {
        this.id_text = id_text;
        this.text_vn = text_vn;
        this.text_en = text_en;
        this.is_delete = is_delete;
    }

    public Long getId_text() {
        return id_text;
    }

    public void setId_text(Long id_text) {
        this.id_text = id_text;
    }

    public String getText_vn() {
        return text_vn;
    }

    public void setText_vn(String text_vn) {
        this.text_vn = text_vn;
    }

    public String getText_en() {
        return text_en;
    }

    public void setText_en(String text_en) {
        this.text_en = text_en;
    }

    public Long getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Long is_delete) {
        this.is_delete = is_delete;
    }

    public Set<Video> getVideoSet() {
        return videoSet;
    }

    public void setVideoSet(Set<Video> videoSet) {
        this.videoSet = videoSet;
    }
}
