package com.myfeike.boot.model;

import javax.persistence.*;

/**
 * Created by izerui.com on 14-4-16.
 */
@Entity(name = "MYTABLE")
public class MyTable {

    @Id
    @Column(name = "ID",length = 50,nullable = false)
    private String id;
    @Column(name = "NAME",length = 256,nullable = true)
    private String name;
    @Column(name = "DELETED")
    private boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.deleted = isDeleted;
    }
}
