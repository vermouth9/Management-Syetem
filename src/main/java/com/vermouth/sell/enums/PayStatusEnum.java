package com.vermouth.sell.enums;

public enum PayStatusEnum implements CodeEnum<Integer> {
    WAIT(0, "未支付"),
    FINISHED(1, "已支付");

    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
