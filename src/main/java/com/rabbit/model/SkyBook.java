package com.rabbit.model;

public class SkyBook {
    public String id;
    public String title;
    public String text;
    public String author;
    public String type;
    public String createtime;
    public String statue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    @Override
    public String toString() {
        return "SkyBook{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", createtime='" + createtime + '\'' +
                ", statue='" + statue + '\'' +
                '}';
    }
}
