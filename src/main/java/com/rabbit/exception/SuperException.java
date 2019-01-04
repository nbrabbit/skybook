package com.rabbit.exception;


public class SuperException extends RuntimeException {

	private static final long serialVersionUID = 3057747178283688946L;

	private int code;
	private String msg;

	public SuperException(Throwable ex) {
		super(ex);
	}

	public SuperException(int code) {
//		super(ExceptionConstants.EXCEPTION_CODE_MAP.get(code));
		this.code = code;
		this.msg = this.getMessage();
	}

	public SuperException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public SuperException(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
