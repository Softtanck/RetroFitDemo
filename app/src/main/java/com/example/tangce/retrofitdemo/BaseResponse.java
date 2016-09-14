package com.example.tangce.retrofitdemo;

/**
 * Created by Tanck on 9/6/2016.
 * <p>
 * Describe:
 */
public class BaseResponse {


    /**
     * code : 0000
     * desc : null
     * token : null
     */

    private String code;
    private String desc;
    private String token;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
