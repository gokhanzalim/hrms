package com.gokhan.hrms.core.utilities;

public class ErrorDataResult<T> extends  DataResult {

    public ErrorDataResult(Object data, String message) {
        super(data, false, message);
    }

    public ErrorDataResult(Object data) {
        super(data, false);
    }

    public ErrorDataResult(String message) {
        super(null, false, message);
    }

    public ErrorDataResult() {
        super(null, false);
    }
}
