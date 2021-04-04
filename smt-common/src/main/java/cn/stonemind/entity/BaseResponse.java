package cn.stonemind.entity;

import cn.stonemind.constant.ResponseConstant;

import java.util.HashMap;

public class BaseResponse extends HashMap<String, Object> {

    public BaseResponse message(String code, String message) {
        this.put("code", code);
        this.put("message", message);
        return this;
    }

    public BaseResponse message(String message) {
        this.put("code", ResponseConstant.SUCCESS_RESPONSE_CODE);
        this.put("message", message);
        return this;
    }

    public BaseResponse error(String message) {
        this.put("code", ResponseConstant.ERROR_RESPONSE_CODE);
        this.put("message", message);
        return this;
    }

    @Override
    public BaseResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public BaseResponse data(Object data) {
        return this.put("data", data);
    }

    public String message() {
        return String.valueOf(this.get("message"));
    }

    public Object getData() {
        return this.get("data");
    }
}
