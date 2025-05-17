package com.mburakaltun.mbaspringcore.controller;

import com.mburakaltun.mbaspringcore.model.response.ApiResponse;
import com.mburakaltun.mbaspringcore.utility.ResponseUtility;

public class BaseController {
    public <T> ApiResponse<T> respond(T data, String message) {
        return ResponseUtility.success(data, message);
    }

    public <T> ApiResponse<T> respond(T data) {
        return ResponseUtility.success(data);
    }

    public <T> ApiResponse<T> respond() {
        return ResponseUtility.success();
    }
}
