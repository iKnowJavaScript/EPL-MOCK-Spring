package com.kingkonsole.eplmock.entity;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    @Id
    @BsonProperty("id")
    private ObjectId id;
    private Long created = System.currentTimeMillis();
    private  boolean active = true;
    private boolean deleted;
    private Long lastModified;

    // Add default letter
    public BaseEntity(){

    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }
}
