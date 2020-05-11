package com.example.banking.dto;

public class HavaleResponse {
    private String status;

    public HavaleResponse() {
    }

    public HavaleResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
