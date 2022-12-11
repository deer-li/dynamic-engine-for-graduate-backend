package com.hfuu.graduate.constants;

/**
 * @author deer-li
 * @date 2022-12-04 20:32
 */
public class GraduateConstant {
    public static final String SESSION_INFO = "user";
    public static final String SESSION_TOKEN_INFO = "token";
    public GraduateConstant() {

    }
    public interface AJAX_STATUS{
        /*
        * 0-操作成功，1-操作失败，2-用户未登录，3-刷新，4-重复提交
        * */
        Integer success = 0;
        Integer error = 1;
        Integer nologin = 2;
        Integer repeat = 4;
    }
}
