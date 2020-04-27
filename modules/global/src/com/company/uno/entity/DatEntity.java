package com.company.uno.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|description")
@Table(name = "UNO_DAT_ENTITY")
@Entity(name = "uno_DatEntity")
public class DatEntity extends StandardEntity {
    private static final long serialVersionUID = -3500208626948101740L;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "TITLE")
    protected String title;

    @Column(name = "NUMBER_")
    protected Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}