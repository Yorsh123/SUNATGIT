package com.electronicbulling.bulling.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Token {
    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("updatedAt")
    private String updatedAt;

    @JsonProperty("code")
    private String code;

    public Token(){}

    public Token(String createdAt, String updatedAt, String code) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.code = code;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    // Getters y setters
}
