package com.project.model;

import javax.persistence.*;

@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_video;

    private String uid;

    private String url;

    private String type;

    private String name;

    private String status;

    private Long is_delete;

    @ManyToOne
    @JoinColumn(name = "id_text")
    private Text text;

    public Video() {
    }

    public Video(Long id_video, String uid, String url, String type, String name, String status, Long is_delete, Text text) {
        this.id_video = id_video;
        this.uid = uid;
        this.url = url;
        this.type = type;
        this.name = name;
        this.status = status;
        this.is_delete = is_delete;
        this.text = text;
    }

    public Long getId_video() {
        return id_video;
    }

    public void setId_video(Long id_video) {
        this.id_video = id_video;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Long is_delete) {
        this.is_delete = is_delete;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }
}
