package com.hfuu.graduate.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.hfuu.graduate.constants.GraduateConstant.AJAX_STATUS;
/**
 * @ author deer-li
 * @ date 2022-12-01 20:17
 * 泛型类，封装前端传递的对象
 */
@ApiModel
public class G<T> {
    @ApiModelProperty("状态(0成功1错误2未登陆4重复提交)")
    private Integer status;
    @ApiModelProperty("错误信息")
    private String msg = "操作成功";
    @ApiModelProperty("数据对象")
    private T data;
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    private transient Boolean ok;
    @JsonIgnore
    private transient Boolean error;

    public G() {
    }

    public G(Integer status) {
        this.status = status;
    }

    public G(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public G(T data) {
        this.data = data;
    }

    public G(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static G<String> ok() {
        return new G(AJAX_STATUS.success);
    }

    public static <E> G<E> ok(E E) {
        G<E> ajaxResult = new G(E);
        ajaxResult.setStatus(AJAX_STATUS.success);
        return ajaxResult;
    }

    public static G<String> error(String msg) {
        G<String> ajaxResult = new G(AJAX_STATUS.error);
        ajaxResult.setMsg(msg);
        return ajaxResult;
    }

    public static <E> G<E> error(E E, String msg) {
        G<E> ajaxResult = new G(E);
        ajaxResult.setStatus(AJAX_STATUS.error);
        ajaxResult.setMsg(msg);
        ajaxResult.setData(E);
        return ajaxResult;
    }

    public static G<String> noLogin() {
        G<String> ajaxResult = new G(AJAX_STATUS.nologin);
        ajaxResult.setMsg("用户未登陆");
        return ajaxResult;
    }

    public static G<String> singleLogin() {
        G<String> ajaxResult = new G(AJAX_STATUS.nologin);
        ajaxResult.setMsg("该账户已经在其他地方登录");
        return ajaxResult;
    }

    public static G<String> notFound() {
        G<String> ajaxResult = new G(AJAX_STATUS.error);
        ajaxResult.setMsg("资源未找到");
        return ajaxResult;
    }

    public static G<String> isRepeat() {
        G<String> ajaxResult = new G(AJAX_STATUS.repeat);
        ajaxResult.setMsg("用户重复提交");
        return ajaxResult;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public boolean isOk() {
        if (this.status == null) {
            this.ok = false;
        }
        this.ok = this.status == AJAX_STATUS.success;
        return this.ok;
    }

    public Boolean getOk() {
        return this.ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public boolean isError() {
        if (this.status == null) {
            this.error = true;
        }

        this.error = this.status != AJAX_STATUS.success;
        return this.error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }
}
