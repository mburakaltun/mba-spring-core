package com.mburakaltun.mbaspringcore.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponse<T> {
    private boolean success;
    private T data;
    private String message;
    private int errorCode;
}
