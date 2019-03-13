package com.yijie.yilian.model;

import java.util.Map;

/**
 * @描述 返回参数模型
 * @author Lucifer
 *
 */
public class ReturnModel {
	
	private String msg;
	
	private Map<String,Object> content;
	
	private Integer code;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getContent() {
		return content;
	}

	public void setContent(Map<String, Object> content) {
		this.content = content;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public ReturnModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReturnModel(String msg, Map<String, Object> content, Integer code) {
		super();
		this.msg = msg;
		this.content = content;
		this.code = code;
	}

	@Override
	public String toString() {
		return "ReturnModel [msg=" + msg + ", content=" + content + ", code=" + code + "]";
	}

}
