package com.respok.admin.common.exception;

import com.respok.admin.common.api.IErrorCode;


public class ApiException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
