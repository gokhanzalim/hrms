package com.gokhan.hrms.core.utilities;

import lombok.Data;

@Data
public class Result {

    private Boolean success;
    private String message;

    public Result(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Result(Boolean success) {
        this.success = success;
    }
}
