package com.onevote;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class BaseModel {

    private User creator;

    private User modifier;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createAt;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifiedAt;


    public BaseModel(User creator, User modifier, LocalDateTime createAt, LocalDateTime modifiedAt) {
        this.creator = creator;
        this.modifier = modifier;
        this.createAt = createAt;
        this.modifiedAt = modifiedAt;
    }

    public BaseModel(){}

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public User getModifier() {
        return modifier;
    }

    public void setModifier(User modifier) {
        this.modifier = modifier;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "creator=" + creator +
                ", modifier=" + modifier +
                ", createAt=" + createAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }
}
