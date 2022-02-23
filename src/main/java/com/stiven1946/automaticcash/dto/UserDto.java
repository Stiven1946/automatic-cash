package com.stiven1946.automaticcash.dto;

public class UserDto {

    public String nameHolder;
    public Integer documentHolder;
    public Integer phone;

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public Integer getDocumentHolder() {
        return documentHolder;
    }

    public void setDocumentHolder(Integer documentHolder) {
        this.documentHolder = documentHolder;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
