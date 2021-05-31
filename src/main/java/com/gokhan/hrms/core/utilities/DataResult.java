package com.gokhan.hrms.core.utilities;

import lombok.Data;

@Data
public class DataResult<T> extends Result{

    private T data;

    public DataResult(T data, Boolean success, String message) {
        super(success, message);
        this.data = data;
    }

    public DataResult(T data, Boolean success) {
        super(success);
        this.data = data;
    }
}
