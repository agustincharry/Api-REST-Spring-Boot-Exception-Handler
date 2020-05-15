package org.agustincharry.ApiRESTSpringBootExceptionHandler.ExceptionHandler;

public class ErrorModel {

    private int status;
    private String code;
    private String title;
    private String detail;

    public ErrorModel(int status, String code, String title, String detail) {
        this.status = status;
        this.code = code;
        this.title = title;
        this.detail = detail;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
