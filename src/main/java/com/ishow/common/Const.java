package com.ishow.common;

public class Const {

    public static final String CURRENT_USER = "currentUser";

    public interface Role {
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;//管理员
    }


    public enum PayTypeEnum {
        WX_PAY(1, "支付宝"),
        ALI_PAY(2, "微信");


        PayTypeEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        private String value;
        private int code;

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }
    }

}
