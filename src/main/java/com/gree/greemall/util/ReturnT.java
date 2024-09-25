package com.gree.greemall.util;


import lombok.Data;

@Data
public class ReturnT<T> {


    private  String code;

    private String message;

    private T data;

    public ReturnT(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public ReturnT(String code, String message){
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public static <T> ReturnT<T> success(T data){
        return new ReturnT(SystemCode.SYSTEM_CODE_SUCCESS,SystemMsg.SUCCESS,data);
    }


    public static ReturnT failed(){
        return new ReturnT(SystemCode.SYSTEM_CODE_FAILED,SystemMsg.FAILED);
    }

    public static ReturnT failed(String code,String message){
        return new ReturnT(code,message);
    }

    public static ReturnT failed(String message){
        return new ReturnT(SystemCode.SYSTEM_CODE_FAILED,message);
    }

}
